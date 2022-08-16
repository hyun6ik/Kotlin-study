package Lec10.kotlin

interface SwimAble {

    val swimAbility: Int
        get() = 3


    fun act() {
        println(swimAbility)
        println("어푸 어푸")
    }

}