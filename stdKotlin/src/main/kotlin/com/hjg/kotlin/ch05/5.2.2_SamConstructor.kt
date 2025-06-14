package com.hjg.kotlin.ch05

fun createAllDoneRunnable() : Runnable {
    //返回 sam构造器
    return Runnable {println("All done!")}
}

fun main() {
    createAllDoneRunnable().run()
}
