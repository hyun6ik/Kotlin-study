import Lec17.java.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 이걸 선호
    val isApple2: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name == "사과"}

    isApple(fruits[0])
    isApple.invoke(fruits[0])

    val appleList = filterFruits(fruits, isApple)
    val appleList2 = filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
    val appleList3 = filterFruits(fruits) { it.name == "사과" }
}

//private fun filterFruits(
//    fruits: List<Fruit>,
//    filter: (Fruit) -> Boolean
//): List<Fruit> {
//    val results = mutableListOf<Fruit>()
//    for (fruit in fruits) {
//        if (filter(fruit)) {
//            results.add(fruit)
//        }
//    }
//    return results
//}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}

