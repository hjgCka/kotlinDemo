package com.hjg.kotlin.ch03

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

/**
 * extend function是编译时就确定调用的方法，无法做到动态绑定。
 * 因为extend function被编译为一个静态方法，第一个参数是receiver object。
 * ExtensionsKt.showOff(view)。
 *
 * 如果扩展函数与成员函数签名相同，那么会优先使用成员函数。
 */
fun View.showOff() = println("View show off")
fun Button.showOff() = println("Button show off")

fun main() {
    val view: View = Button()
    view.click()

    view.showOff()
}
