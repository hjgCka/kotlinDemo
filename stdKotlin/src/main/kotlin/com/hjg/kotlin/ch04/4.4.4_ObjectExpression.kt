package com.hjg.kotlin.ch04.ObjectExpression

interface MouseListener {
    fun onEnter()
    fun onClick()
}

class Button(private val listener: MouseListener) {

}

fun main() {
    var clickCount = 0
    Button(object : MouseListener {
        override fun onEnter() {}
        override fun onClick() {
            /**
             * 对象表达式可以访问、修改 普通变量
             */
            clickCount++
        }
    })
}
