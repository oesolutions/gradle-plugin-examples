apply(from = "../examples.gradle.kts")

plugins {
    testing
    `java-gradle-plugin`
}

repositories {
    jcenter()
}

dependencies {
    spock("org.spockframework:spock-core:1.3-groovy-2.5") {
        // Groovy is already included as part of the Gradle API (included by the java-gradle-plugin).
        exclude(group = "org.codehaus.groovy")
    }
}

gradlePlugin {
    plugins {
        create("widgetPlugin") {
            id = "com.github.oesolutions.widget"
            implementationClass = "com.github.oesolutions.gradle.widget.WidgetPlugin"
        }
    }
}
