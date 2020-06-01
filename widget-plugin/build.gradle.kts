plugins {
    id("java-gradle-plugin")
}

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
