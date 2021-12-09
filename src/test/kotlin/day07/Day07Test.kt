package day07

import org.junit.jupiter.api.Test

class Day07Test {
    @Test
    fun partOne() {
        //Given
        val input = listOf(16, 1, 2, 0, 4, 2, 7, 1, 2, 14)
        //When
        val result = Day07().partOne(input)
        //Then
        assert(2 == result)
    }

    @Test
    fun partTwo() {
        //Given
        val input = listOf(16, 1, 2, 0, 4, 2, 7, 1, 2, 14)
        //When
        val result = Day07().partTwo(input)
        //Then
        assert(168 == result)
    }
}