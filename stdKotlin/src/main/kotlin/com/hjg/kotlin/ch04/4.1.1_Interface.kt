package com.hjg.kotlin.ch04

interface Clickable {
    fun click()

    fun showOff() = println("I'm clickable")
}

interface  Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus")
    fun showOff() = println("I'm focusable")
}

/**
 * 这里的冒号用于实现接口 和 继承父类。
 * 如果一个类实现多个接口，且接口都有同样签名的方法，那么实现类必须实现自己的方法，否则报错。
 *
 * 上面的2个接口的showOff方法，带有方法体，类似java8的默认方法/静态方法。
 * 在编译后，其实形成了一个只有声明的接口 和 一个实现了接口的静态方法。
 * 如果java代码实现Focusable或Clickable接口的话，需要实现它们所有的方法。
 */
class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    val button = Button()
    button.click()
    button.showOff()

    button.setFocus(true)
}
