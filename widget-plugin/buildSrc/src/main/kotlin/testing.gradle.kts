plugins {
    groovy
}

val spock by configurations.creating {
    description = "Spock Framework dependencies"
    isCanBeConsumed = false
    isCanBeResolved = false
}

configurations.testImplementation.get().extendsFrom(spock)

listOf("integration", "functional").forEach { name ->
    val srcSetName = "${name}Test"
    val srcSet = sourceSets.create(srcSetName) {
        compileClasspath += sourceSets.main.get().output
        runtimeClasspath += sourceSets.main.get().output
    }
    configurations.named(srcSet.implementationConfigurationName) {
        extendsFrom(configurations.implementation.get())
        extendsFrom(spock)
    }
    configurations.named(srcSet.runtimeOnlyConfigurationName) {
        extendsFrom(configurations.runtimeOnly.get())
    }
    tasks.register<Test>(srcSetName) {
        description = "Runs the ${name} tests."
        group = "verification"

        testClassesDirs = srcSet.output.classesDirs
        classpath = srcSet.runtimeClasspath
    }
}

pluginManager.withPlugin("java-gradle-plugin") {
    extensions.getByType(GradlePluginDevelopmentExtension::class).testSourceSets(project.sourceSets["functionalTest"])
}

tasks.check.configure {
    dependsOn("integrationTest")
}
