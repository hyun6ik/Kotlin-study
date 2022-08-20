package Lec14.kotlin

fun main() {
    val dto1 = PersonDto("윤현식", 100)
    val dto2 = PersonDto("윤현식", 100)
    println(dto1 == dto2)
}

data class PersonDto(
    val name: String,
    val age: Int
) {
}