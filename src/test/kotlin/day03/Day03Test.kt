package day03

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Day03Test {

    @Test
    fun partOne() {
        //Given
        val input = """
            00100
            11110
            10110
            10111
            10101
            01111
            00111
            11100
            10000
            11001
            00010
            01010
        """.trimIndent()
        //When
        val result = Day03().partOne(input)
        //Then
        assert(198 == result)
    }

    @Test
    fun partTwo() {
        //Given
        val input = """
            00100
            11110
            10110
            10111
            10101
            01111
            00111
            11100
            10000
            11001
            00010
            01010
        """.trimIndent()
        //When
        val result = Day03().partTwo(input)
        //Then
        assert(198 == result)
    }
}