package day06

class Day06(private val sea: Sea) {

    fun play(noOfDays: Int): Int {
        repeat(noOfDays) { sea.newDay() }
        return sea.fishCount
    }
}

class Sea(private val population: MutableList<Lanternfish>) {

    fun newDay() {
        val newFishes = population.mapNotNull { fish ->
            fish.giveBirth()
        }
        population.addAll(newFishes)
    }

    val fishCount
        get() = population.count()
}