rootProject.name = "gradle-utf8"

pluginManagement {
    plugins {
        id("com.gradle.plugin-publish") version "${extra["plugin.plugin-publish.version"]}"
    }
}