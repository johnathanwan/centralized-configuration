@file:Suppress("UnstableApiUsage")

rootProject.name = "centralized-configuration"
include("configuration-server")
include("configuration-client")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}