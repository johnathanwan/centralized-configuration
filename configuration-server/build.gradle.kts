plugins {
    id("org.example.centralized-configuration.common-conventions")
}

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.springframework.cloud:spring-cloud-config-server")
}

