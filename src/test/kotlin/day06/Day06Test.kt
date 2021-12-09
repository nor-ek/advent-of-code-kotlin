package day06

import org.junit.jupiter.api.Test

class Day06Test {

    @Test
    fun `happy path`() {
        //Given
        val input = "3,4,3,1,2"
        val fishPopulation = input.split(",").map { Lanternfish(it.toInt()) }.toMutableList()
        val initialSea = Sea(fishPopulation)
        val daysNumber = 18
        //When
        val result = Day06(initialSea).play(daysNumber)
        //Then
        assert(26 == result)
    }
}