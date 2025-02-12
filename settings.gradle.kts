@file:Suppress("UnstableApiUsage")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://packages.jetbrains.team/maven/p/firework/dev")
        gradlePluginPortal()
        mavenCentral()
        google()
        mavenLocal()
    }

    plugins {

    }
}

dependencyResolutionManagement {
    repositories {
        maven("https://packages.jetbrains.team/maven/p/firework/dev")
        google()
        mavenCentral()
        mavenLocal()
    }
}

rootProject.name = "resvg-kt"

include(":resvg")