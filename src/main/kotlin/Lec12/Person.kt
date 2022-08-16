package Lec12

fun main() {
    Person.Factory.newBaby("현식")
    Person.newBaby("윤현식")

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : MoveAble {
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }
    })
}

class Person private constructor(
    val name: String,
    val age: Int
) {
    companion object Factory : Log{
        private const val MIN_AGE = 0

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요")
        }
    }
}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(moveAble: MoveAble) {
    moveAble.move()
    moveAble.fly()
}