package Lec16

fun main() {
    val person = Person("윤", "현식", 28)
    val nextYearAge = person.nextYearAge()
    println(nextYearAge)
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}