pluginManagement {
    apply(from = "extra-props.gradle.kts")
    repositories {
        maven {
            url = uri("${extra["localRepo.path"]}")
        }
        gradlePluginPortal()
    }
    plugins {
        id("com.github.oesolutions.widget") version ("${extra["examples.version"]}")
    }
}
