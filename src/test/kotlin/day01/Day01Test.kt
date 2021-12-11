package day01

import org.junit.jupiter.api.Test

class Day01Test {

    @Test
    fun partOne() {
        //Given
        val input = """
199
200
208
210
200
207
240
269
260
263
        """.trimIndent().lines().map {
            it.trim().toInt()
        }
        //When
        val result = Day01().partOne(input)
        //Then
        assert(7 == result)
    }

    @Test
    fun partTwo() {
        //Given
        val input = """
199
200
208
210
200
207
240
269
260
263
        """.trimIndent().lines().map {
            it.trim().toInt()
        }
        //When
        val result = Day01().partTwo(input)
        //Then
        assert(5 == result)
    }
}