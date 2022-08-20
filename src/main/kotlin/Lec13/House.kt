package Lec13

class House(
    private val address: String,
    private val livingRoom: LivingRoom = LivingRoom(10.0)
) {
    class LivingRoom(
        private val area: Double
    )
}