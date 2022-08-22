package Lec16

fun main() {
    3.add(4)
}

inline fun Int.add3(other: Int): Int {
    return this + other
}
