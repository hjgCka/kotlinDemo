plugins {
    id("shared-std-kotlin")
}

dependencies {
    /**
     * 没有将commons-lang3暴露给kotlin-springboot-demo。
     * 对于代码，要求是commons-lang3的class不可出现在方法签名中。
     * 如果某个public class中的字段是commons-lang3，如果kotlin-springboot-demo没用这个字段的话，编译也不需要commons-lang3。
     *
     * 对于减少kotlin-springboot-demo的编译时的classpath长度非常有用。
     */
    implementation("org.apache.commons:commons-lang3:3.17.0")
}
