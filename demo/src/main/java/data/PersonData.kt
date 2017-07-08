package data

data class PersonData(var name: String, var surname: String, var weight: Float?)

fun main(args : Array<String>) {
    var p = PersonData("Alberto", "Ruibal", 96f)
    println(p)
}