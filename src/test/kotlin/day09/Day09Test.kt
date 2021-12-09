package day09

import org.junit.jupiter.api.Test

class Day09Test {
    @Test
    fun partOne() {
        //Given
        val input = """
2199943210
3987894921
9856789892
8767896789
9899965678
        """.trimIndent()
        //When
        val result = Day09().partOne(input)
        //Then
        println(result)
        assert(15 == result)
    }

    @Test
    fun partTwo() {
        //Given
        val input = """
2199943210
3987894921
9856789892
8767896789
9899965678
        """.trimIndent()
        //When
        val result = Day09().partTwo(input)
        //Then
        println(result)
        assert(1134 == result)
    }
}