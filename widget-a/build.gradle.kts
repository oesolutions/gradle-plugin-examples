plugins {
    id("com.github.oesolutions.widget")
}

group = "com.github.oesolutions.gradle.plugin.examples"
version = "1.0"

tasks.named<Wrapper>("wrapper") {
    distributionType = Wrapper.DistributionType.ALL
}
