package test

fun main(args: Array<String>) {
    fun String?.xxx() = this ?: "xxx"
    var x :String? = null
    print(x.xxx())
}