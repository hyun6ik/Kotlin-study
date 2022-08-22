package Lec16

fun main() {
    val str = "ABC"
    val char = str.lastChar()
    println(char)
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}
