
plugins {
    `kotlin-dsl`
}

dependencies {
    //引入的插件，其实就相当于普通的依赖，编码时可以引用到。
    //只是这里引入的依赖，作为编写脚本时可用的依赖。
    //由于buildSrc模块比较特殊是 组合构建模块，这里的依赖也传递给了其它模块，比如stdKotlin。
    //所以stdKotlin模块中，不能指定kotlin插件体的版本号，不然会报错。
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.20")
}
