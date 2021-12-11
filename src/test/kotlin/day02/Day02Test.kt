package day02

import org.junit.jupiter.api.Test

class Day02Test {

    @Test
    fun partOne() {
        //Given
        val input = """
forward 5
down 5
forward 8
up 3
down 8
forward 2
        """.trimIndent()
        //When
        val result = Day02().partOne(input)
        //Then
        assert(150 == result)
    }


    @Test
    fun partTwo() {
        //Given
        val input = """
forward 5
down 5
forward 8
up 3
down 8
forward 2
        """.trimIndent()
        //When
        val result = Day02().partTwo(input)
        //Then
        assert(900 == result)
    }
}