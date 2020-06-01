plugins {
    id("java-gradle-plugin")
}

group = "com.github.oesolutions.gradle.plugin.examples"
version = "1.0"

tasks.named<Wrapper>("wrapper") {
    distributionType = Wrapper.DistributionType.ALL
}

gradlePlugin {
    plugins {
        create("widgetPlugin") {
            id = "com.github.oesolutions.widget"
            implementationClass = "com.github.oesolutions.gradle.widget.WidgetPlugin"
        }
    }
}
