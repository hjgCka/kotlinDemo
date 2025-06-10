package strings

/**
 * 一个function作为一个class的成员被调用，但是function定义在这个class之外。
 *
 * String是receiver type，而receiver object是type的实例。
 *
 * this也是可以省略的。
 *
 * 扩展语法无法访问类中private和protected的成员。
 * 在扩展函数中，不区分receiver的方法和扩展函数。即可以调用方法和其它扩展函数。
 *
 * 扩展函数实际上会被编译为，接收一个receiver object的静态方法。
 * 调用扩展函数，不涉及创建适配器对象或任何其它运行时开销。
 * 包含方法的类名，由声明方法的文件名称所决定。
 */
fun String.lastChar(): Char = this.get(this.length - 1)

fun main() {
    println("Kotlin".lastChar())
}
