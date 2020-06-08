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
    gradleVersion = "${project.extra["wrapper.version"]}"
    distributionType = Wrapper.DistributionType.valueOf("${project.extra["wrapper.type"]}")
    distributionSha256Sum = "${project.extra["wrapper.checksum"]}"
}
