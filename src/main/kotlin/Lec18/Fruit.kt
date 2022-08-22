package Lec18


data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
) {
    val isSamePrice: Boolean
        get() = factoryPrice == currentPrice
}


val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter (Fruit::isSamePrice)

fun main() {
    val fruits = listOf(
        Fruit(1L,"사과", 1000,2000),
        Fruit(2L,"사과", 1000,2000),
    )

    // 사과만 주세요
    fruits.filter { fruit -> fruit.name == "사과" }

    // 필터에서 인덱스가 필요하다면??
    fruits.filterIndexed {idx, fruit ->
        println(idx)
        fruit.name == "사과 "
    }

    // 사과의 가격들을 알려주세요
    fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }

    // 맵에서 인덱스가 필요하다면?
    fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.name == "사과과"
       }

    // 매핑의 결과가 null이 아닌것만 가져오고 싶다면?
    fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.nullOrValue() }

    // all : 조건을 모두 만족하면 true 그렇지 않으면 false
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }

    // none : 조건을 모두 불만족하면 true 그렇지 않으면 false
    val isNoApple = fruits.none { fruit -> fruit.name == "사과" }

    // any : 조건을 하나라도 만족하면 true, 그렇지 않으면 false
    val isAnyApple = fruits.any { fruit -> fruit.factoryPrice >= 10_000 }

    // count : 개수를 센다.
    val fruitCount = fruits.count()

    // sortedBy : (오름차순) 정렬을 한다.
    fruits.sortedBy { fruit -> fruit.currentPrice }

    // sortedByDescending : (내림차순) 정렬을 한다.
    fruits.sortedByDescending { fruit -> fruit.currentPrice }

    // distinctBy : 변형된 값을 기준으로 중복을 제거한다.
    fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    // first: 첫번째 값을 가져온다 (무조건 null이 아니어야함)
    fruits.first()

    // fristOrNull : 첫번째 값 또는 null을 가져온다.
    fruits.firstOrNull()

    // 과일 이름 -> List<과일> Map 변환
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }

    // id -> 과일 Map 변환
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    // 과일이름 -> List<출고가> Map 변환
    val map3: Map<String, List<Long>> = fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })

    // id -> 출고가 Map 변환
    val map4: Map<Long, Long> = fruits.associateBy({ fruit -> fruit.id }, { fruit -> fruit.factoryPrice })

    // 사과 -> List<과일> 맵변환
    fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과" }


    val fruitsInList = listOf(
        listOf(
            Fruit(1L, "사과", 1_000, 1_500),
            Fruit(2L, "사과", 1_200, 1_500),
            Fruit(3L, "사과", 1_200, 1_500),
            Fruit(4L, "사과", 1_500, 1_500),
        ),
        listOf(
            Fruit(5L, "바나나", 3_000, 3_200),
            Fruit(6L, "바나나", 3_200, 3_200),
            Fruit(7L, "바나나", 2_500, 3_200),
        ),
        listOf(
            Fruit(8L, "수박", 10_000, 10_000),
        )
    )

    // 출고가와 현재가가 동일한 과일을 골라주세요
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }

    val samePriceFruits2 = fruitsInList.flatMap { list -> list.samePriceFilter }

    // List<List<Fruit>>를 List<Fruit>로 그냥 바꿔주세요
    fruitsInList.flatten()
}


