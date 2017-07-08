package lambdas

class Lambdas {

    fun highOrderFunction(str: String, myFun: (Char) -> Char): String {
        var strOut = ""
        for (c in str) strOut += myFun(c)
        return strOut
    }

    fun uppercaseChar(c: Char) = c.toUpperCase()

    fun main() {
        println(highOrderFunction("hello", this::uppercaseChar))
        println(highOrderFunction("hello", Char::toUpperCase))
        println(highOrderFunction("hello", { a -> a.toUpperCase() }))
        println(highOrderFunction("hello") { a -> a.toUpperCase() })
        println(highOrderFunction("hello") { it.toUpperCase() })
    }
}

fun main(args: Array<String>) {
    var lambdas = Lambdas()
    lambdas.main()
}