plugins {
    id("java-gradle-plugin")
}
apply(from = "../wrapper.gradle.kts")

group = "com.github.oesolutions.gradle.plugin.examples"
version = "1.0"

gradlePlugin {
    plugins {
        create("widgetPlugin") {
            id = "com.github.oesolutions.widget"
            implementationClass = "com.github.oesolutions.gradle.widget.WidgetPlugin"
        }
    }
}
