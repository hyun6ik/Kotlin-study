package Lec19

class NewPerson(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }
    operator fun component2(): Int {
        return this.age
    }
}


fun main() {
    val person = NewPerson("현식", 28)
    val (name, age) = person
    println("이름 : $name, 나이 : $age")

}