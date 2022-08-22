package Lec19

class Number(
    val number: Int
) {
    fun getNumberOrNull(): Int? {
        return if (number <= 0) {
            null
        } else {
            number
        }
    }

    // takeIf : 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null을 반환
    fun getNumberOrNull2(): Int? {
        return number.takeIf { it > 0 }
    }

    // takeUnless : 주어진 조건을 만족하지 않으면 그 값이, 그렇지 않으면 null을 반환
    fun getNumberOrNUll3(): Int? {
        return number.takeUnless { it <= 0 }
    }
}

