package day06

class Lanternfish(var days: Int = 8) {

    private fun sleep() {
        if (days > 0)
            days -= 1
    }

    fun giveBirth(): Lanternfish? {
        return if (canGiveBirth) {
            days = 6
            Lanternfish()
        } else {
            sleep()
            null
        }
    }

    private val canGiveBirth: Boolean
        get() = days == 0
}