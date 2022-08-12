package Lec02

fun main() {

//    val str: String? = "ABC"
    val str: String? = null

//    str.length  안됨
    str?.length

    val result = str?.length ?: 0

    println(result)


    val person = Person("현식")
    startWithA(person.name)

}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")

//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    }
//    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")

//    if (str == null) {
//        return null;
//    }
//    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false

//    if (str == null) {
//        return false;
//    }
//    return str.startsWith("A")
}

fun startWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}