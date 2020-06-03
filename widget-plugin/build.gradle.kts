plugins {
    testing
    `java-gradle-plugin`
}
apply(from = "../wrapper.gradle.kts")

group = "com.github.oesolutions.gradle.plugin.examples"
version = "1.0"

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
