package Lec16

open class Train (
    val name: String = "새마을 기차",
    val price: Int = 5_000
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장 함수")
    return this.price >= 10000
}

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장 함수")
    return this.price >= 10000
}


fun main() {
    val train = Train()
    train.isExpensive()

    val srt1: Train = Srt()
    srt1.isExpensive()

    val srt2 = Srt()
    srt2.isExpensive()

}