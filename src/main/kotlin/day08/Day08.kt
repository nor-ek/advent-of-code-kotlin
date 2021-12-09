package day08

class Day08 {

    private fun String.splitInput() = this.lines().map { it.split("|") }

    fun partOne(input: String): Int {
        val lines: List<String> = input.splitInput()[1]
        return lines.sumOf { it.split(" ").count { it.length in listOf(2, 3, 4, 7) } }
    }
}