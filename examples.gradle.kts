apply(from = "../extra-props.gradle.kts")
apply(plugin = "maven-publish")

group = "com.github.oesolutions.gradle-plugin-examples"
version = "${extra["examples.version"]}"

configure<PublishingExtension> {
    repositories {
        maven {
            name = "ExamplesLocal"
            url = uri("${extra["localRepo.path"]}")
        }
    }
}

tasks.named<Wrapper>("wrapper") {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "${project.extra["wrapper.version"]}"
}
