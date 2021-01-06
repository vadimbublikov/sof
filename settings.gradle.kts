rootProject.name = "sof"
include("app")

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false
    }

    repositories {
        gradlePluginPortal()
    }
}

include(":app")
