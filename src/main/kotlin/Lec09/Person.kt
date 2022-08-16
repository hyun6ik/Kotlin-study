package Lec09

fun main() {
//    val person = Person("현식", 28)
//    println(person.name)
//    person.age = 10
//    println(person.age)
//
//    val person2 = Person("현식")

    Person()
}

class Person(
    name: String = "윤현식",
    var age: Int = 1
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 $age 일 수 없습니다.")
        }
        println("초기화 블록")
    }

    //
//    constructor(name: String) : this(name, 1) {
//        println("첫 번째 부생성자")
//    }
//
//    constructor() : this("윤현식") {
//        println("두 번째 부생성자")
//    }


    val isAdult: Boolean
        get() = this.age >= 20

//    val name = name
//        get() = field.uppercase()

    var name = name
        set(value) {
            field = value.uppercase()
        }

    val uppercaseName: String
        get() = this.name.uppercase()
}