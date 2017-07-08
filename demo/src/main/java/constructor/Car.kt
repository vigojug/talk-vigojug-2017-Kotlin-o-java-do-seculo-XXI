package constructor

class Car(make: String, model: String) {
    init {
        println("Creating a car $make $model")
    }

    constructor(make: String) : this(make, "")
}

fun main(args: Array<String>) {
    var car = Car("Citroen", "C3")
    var car2 = Car("Opel")
}