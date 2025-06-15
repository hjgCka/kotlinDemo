//import org.jetbrains.kotlin.gradle.dsl.JvmTarget
//import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
//
//plugins {
//    id("java")
//    //kotlin("jvm") version "2.1.20"
//    kotlin("jvm")
//}
//
//group = "com.hjg"
//version = "1.0-SNAPSHOT"
//
//repositories {
//    mavenCentral()
//}
//
//dependencies {
//    testImplementation(kotlin("test"))
//    testImplementation(platform("org.junit:junit-bom:5.10.0"))
//    testImplementation("org.junit.jupiter:junit-jupiter")
//}
//
//tasks.test {
//    useJUnitPlatform()
//}
//
//java {
//    toolchain {
//        languageVersion = JavaLanguageVersion.of(17)
//    }
//}
//
//kotlin {
//    jvmToolchain {
//        languageVersion.set(JavaLanguageVersion.of(17))
//    }
//    // Or shorter: For example:
//    //jvmToolchain(17)
//
//    // 可选：显式设置编译选项
//    compilerOptions {
//        jvmTarget.set(JvmTarget.JVM_17)
//        languageVersion.set(KotlinVersion.KOTLIN_2_1)
//    }
//}

plugins {
    id("my-shared-kotlin")
}
