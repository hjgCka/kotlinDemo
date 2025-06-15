//如果初始化脚本也配置了，会与初始化脚本的配置合并，解析策略可能会覆盖。
/*pluginManagement {
    repositories {
        maven("https://mirrors.tencent.com/nexus/repository/maven-public")
        maven("https://mirrors.tencent.com/nexus/repository/gradle-plugins")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven ("https://maven.aliyun.com/repository/spring-plugin")
        gradlePluginPortal()
    }
}*/

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "kotlinDemo"

include("stdKotlin")
