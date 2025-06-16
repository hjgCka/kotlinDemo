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
     * kotlin官方维护的插件，如果不加上它，总是会提醒@SpringBootApplication注解的类
     * 需要被设为open。
     * 它与@Configuration的proxyBeanMethods属性有关系。
     */
    //kotlin("plugin.spring")
    id("org.jetbrains.kotlin.plugin.spring") version "2.1.20"

    id("org.springframework.boot") version "3.4.6"
}

apply(plugin = "io.spring.dependency-management")

dependencies {
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

/**
 * 需被 Spring 容器管理的组件（如 @Service、@Controller、@Repository）必须定义在类中。
 * 数据实体类、DTO 等需定义为类，可配合 data class 简化开发。
 * 需要继承父类或实现接口的类型必须定义为类。
 */
