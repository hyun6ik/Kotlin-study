package Lec03

fun main() {
    stringIndexing()
}

fun type1() {
    val number1 = 4
    val number2: Long = number1.toLong()

    val number3 = 3
    val number4 = 5
    val doubleResult = number3 / number4.toDouble()
    println(doubleResult)
}

fun type2() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}

fun printAgeIfNotPerson(obj: Any) {
    if (obj !is Person) {
        println("is Not Person")
    }
}

fun stringInterpolation() {
    val person = Person("현식", 28)
    val message = "사람 이름은 ${person.name}이고 나이는 ${person.age}세 입니다."
    val message2 = "좋은 언어구나"
    println(message)
    println("코틀린은 : $message2")
}

fun withoutIndent() {
    val name = "윤현식"
    val message = """
        안녕하세요
        저는 $name 입니다.
        코틀린에는 이런 기능도 있네요
        신기합니다.
    """.trimIndent()
    println(message)
}

fun stringIndexing() {
    val str = "ABCDE"
    println(str[0])
    println(str[2])
    println(str[4])
}

// Any
// - Java의 Object 역할(모든 객체의 최상위 타입)
// - 모든 Primitive Type의 최상위 타입도 Any다.
// - Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면 Any?로 표현한다.
// - Any에 equals / hashCode / toString이 존재한다.

// Unit
// - Unit은 Java의 void와 동일한 역할을 한다.
// - void와는 다르게 Unit은 그 자체로 타입 인자로 사용 가능하다.
// - 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미한다.
//   - 즉 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현한다.

// Nothing
// - Nothing은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할이다.
// - 무조건 예외를 반환하는 함수 / 무한 푸르 함수 등
// - 많이 사용하지는 않는다.

