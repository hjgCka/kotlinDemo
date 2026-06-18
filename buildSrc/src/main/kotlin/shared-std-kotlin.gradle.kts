import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
    id("java")

    //这里无需指定版本，因为build.gradle.kts中依赖org.jetbrains.kotlin:kotlin-gradle-plugin，已经指定了版本且放入了classpath。
    //已经在当前构建 classpath 中存在的插件，使用 id(...) 应用时禁止携带 version()，带版本会直接报错。

    //这2种写法等价，前者是JetBrains 官方封装的类型安全简写语法（仅 .gradle.kts 可用），后者是Gradle 标准原生通用写法。
    //kotlin("jvm") 只是对长插件 ID 的语法糖封装，底层等价于 id("org.jetbrains.kotlin.jvm")。
    //kotlin("jvm")
    id("org.jetbrains.kotlin.jvm")
}

group = "com.hjg"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // 主源码集
    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")

    // 测试源码集
    testCompileOnly("org.projectlombok:lombok:1.18.32")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.32")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)

    // 可选：显式设置编译选项
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
        languageVersion.set(KotlinVersion.KOTLIN_2_3)
    }
}
