// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    extra.apply {
        set("nav_version", "2.7.4")
        set("room_version", "2.5.2")
        set("compose_ui_version", "1.5.3")
        set("androidx_lifecycle_version", "2.6.2")
    }
}

plugins {
    id("com.android.application") version "8.1.2" apply false
    id("com.android.library") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}