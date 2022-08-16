package Lec11

private val NUM = 3

fun add(a: Int, b: Int): Int {
    println(NUM)
    return a + b
}

open class Cat protected constructor()

class Car(
    internal val name: String,
    private val owner: String,
    _price: Int
){
    var price = _price
        private set

}

