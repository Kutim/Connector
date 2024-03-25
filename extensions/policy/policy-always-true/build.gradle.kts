plugins {
    `java-library`
    id("application")
}

dependencies {
    api(project(":spi:common:core-spi"))
    api(project(":spi:common:policy-engine-spi"))
    api(project(":spi:control-plane:control-plane-spi"))
    implementation(project(":extensions:common:api:api-core"))

}
