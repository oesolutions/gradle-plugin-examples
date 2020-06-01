plugins {
    id("com.github.oesolutions.widget")
}

tasks.named<Wrapper>("wrapper") {
    distributionType = Wrapper.DistributionType.ALL
}
