package Lec20

import Lec14.kotlin.PersonDto
import Lec19.Person

// Scope Function :
// 람다를 사용해 일시적인 영역을 만들고 코드를 더 간결하게 만들거나
// method chaning에 활용하는 함수


fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPerson2(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

// it, this 차이
// this : 생략이 가능한 대신, 다른 이름을 붙일 수 없다.
// it : 생략이 불가능한 대신, 다른 이름을 붙일 수 있다.

// with(파라티머, 람다) : this를 사용해 접근하고, this는 생략 가느하다.

fun main() {
    val person = Person("현식", 28)

    // age 반환, it 사용
    val value1 = person.let { it.age }

    person.let { p -> p.age }

    // age 반환, this 사용
    val value2 = person.run { this.age }

    person.run { age }

    // Person 객체 반환, it 사용
    val value3 = person.also { it.age }

    // Person 객체 반환, this 사용
    val value4 = person.apply { this.age }

    Person("윤현식",1)
    with(person) {
        println(name)
        println(this.age)
    }
}

fun letUse() {
    val strings = listOf("APPLE", "CAR", "MELON")
    strings.map { it.length }
        .filter { it > 3 }
        .let (::println)

    val str = "NOT_NULL"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem"
        }.uppercase()
    println(modifiedFirstItem)
}

// run() 별로 잘 안사용
fun runUse() {
    // 잘 사용하지는 않음

//    val person = Person("현식",28).run(personRepository::save)
//
//    val person = Person("현식",28).run {
//        hobby = "독서"
//        personRepository.save(this)
//    }

}
// apply 사용
fun createPerson(
    name: String,
    age: Int,
    hobby: String
): Person {
    return Person(
        name = name,
        age = age
    ).apply {
//        this.hobby = hobby
    }
}

fun alsoUse() {
    mutableListOf("one", "two", "three")
        .also { println("four 추가 이전 지금 값 : $it") }
        .add("four")

    val numbers = mutableListOf("one", "two", "three")
    println("four 추가 이전 지금 값 : $numbers")
    numbers.add("four")
}

//with
// 특정 객체를 다른 객체로 변환해야 하는데 모듈간의 의존성에 의해
// 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때
fun withUse() {
    val person = Person("현식", 28)
    return with(person) {
        PersonDto(
            name = name,
            age = age
        )
    }
}