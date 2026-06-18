//plugins {
//    id("java")
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
//    testImplementation(platform("org.junit:junit-bom:5.10.0"))
//    testImplementation("org.junit.jupiter:junit-jupiter")
//}
//
//tasks.test {
//    useJUnitPlatform()
//}

plugins {
    id("shared-std-kotlin")

    /**
     * kotlin官方维护的插件。
     * kotlin-plugin.spring：解决 Kotlin 默认 final 不能被 CGLIB 继承代理的语法问题，作用在编译期；
     * proxyBeanMethods：控制 Spring 是否要对 @Configuration 类做 CGLIB 代理的业务特性开关，作用在 Spring 容器初始化阶段；
     * 只要你的配置类用默认 proxyBeanMethods=true，必须依赖该插件；关闭代理后只是绕开了配置类的限制，但业务层 AOP 依旧需要这个插件。
     *
     * 最佳实践：
     * 1. Kotlin + Spring Boot 项目永远建议带上 kotlin("plugin.spring")；
     * 2. 配置类统一使用 @Configuration(proxyBeanMethods = false) 优化启动性能，规避配置类内部 @Bean 方法直接调用的坑；
     * 3. 插件依然保留，用来保证事务、缓存、异步等 AOP 功能正常代理生效。
     */
    //kotlin("plugin.spring")
    id("org.jetbrains.kotlin.plugin.spring") version "2.3.20"

    id("org.springframework.boot") version "3.4.6"
}

// 版本与由org.springframework插件引入的插件版本绑定
apply(plugin = "io.spring.dependency-management")

dependencies {
    // developmentOnly("org.springframework.boot:spring-boot-devtools")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":util"))

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

/**
 * 需被 Spring 容器管理的组件（如 @Service、@Controller、@Repository）必须定义在类中。
 * 数据实体类、DTO 等需定义为类，可配合 data class 简化开发。
 * 需要继承父类或实现接口的类型必须定义为类。
 */
