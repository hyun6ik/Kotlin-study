package Lec15.kotlin

fun array() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("$i ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("$idx, $value")
    }
}

fun collection() {
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    
    // 하나 가져오기
    numbers[0]

    for (number in numbers) {
        println(number)
    }

    for ( (idx, value) in numbers.withIndex()) {
        println("$idx, $value")
    }
}

fun mutableCollection() {
    val numbers = mutableListOf(100, 200)
    numbers.add(300)
}

fun set() {
    val set = setOf(100, 200)

    for (s in set) {
        println(s)
    }

    for ((idx, value) in set.withIndex()) {
        println("$idx,$value")
    }
}

fun mutableSet() {
    val mutableSet = mutableSetOf(100, 200)
    mutableSet.add(300)
}

fun map() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val newMap = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println("$key, $value")
    }
}

fun nullableList() {
    // List<Int?> : 리스트에 null이 들어갈 수 있지만 리스트는 절대 null이 아니다.
    // List<Int>? : 리스트에는 null이 들어갈 수 없지만 리스트는 null일 수 있다.
    // List<Int?>? : 리스트에 null이 들어갈 수도 있고 리스트가 null일 수도 있다.
}


