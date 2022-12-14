package Lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    if (money1 > money3) {
        println("Money1이 Money2보다 금액이 큽니다")
    }

    println(money1 === money2)
    println(money1 === money3)
    println(money1 == money3)

    if (fun1() || fun2()) {
        println("fun2()는 생략됨")
    }
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}