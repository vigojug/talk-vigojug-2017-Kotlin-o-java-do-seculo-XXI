package types

fun main(args: Array<String>) {

    var numbers = intArrayOf(1, 5, 3, 7)
    //var numbers = setOf(1, 5, 3, 7)
    //var numbers = mutableSetOf(1, 5, 3, 7)

    //println(numbers[1])
    //numbers.add(24)

    println(numbers
            .map { it * 2 }
            .filter { it > 2 }
            .sortedBy { it }
            //.count()
    )
}
