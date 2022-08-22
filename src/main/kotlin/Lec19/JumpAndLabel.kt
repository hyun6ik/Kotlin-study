package Lec19

fun main() {
    val numbers = listOf(1, 2, 3)

    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }

    for (number in numbers) {
        if (number == 2) {
            break
        }
        println(number)
    }

    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
            println(number)
        }
    }

    //continue
    numbers.forEach{ number ->
        if (number == 2) {
            return@forEach
        }
    }

    // BUT break, continue를 사용할때엔 for문 사용 추천


    //Label : 특정 expression에 라벨이름@ 을 붙여 하나의 라벨로 간주하고
    //         break, continue, return 등을 사용하는 기능
    // BUT Label을 사용한 Jump는 비추천
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@loop
            }
            println("$i $j")
        }
    }
}