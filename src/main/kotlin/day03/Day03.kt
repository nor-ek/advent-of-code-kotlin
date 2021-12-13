package day03

class Day03 {
    fun partOne(input: String): Int {
        val (gamma, epsilon) = listOf(StringBuilder(), StringBuilder())
        val lines = input.lines()
        lines.first().forEachIndexed { index, _ ->
            val mostCommonBit = lines.mostCommonBit(index)
            if (mostCommonBit == '0') epsilon.append('1') else epsilon.append('0')
            gamma.append(mostCommonBit)
            println("in $index, gamm: $gamma, eps: $epsilon ")
        }
        println("$gamma, $epsilon")
        return Integer.parseInt(gamma.toString(), 2) * Integer.parseInt(epsilon.toString(), 2)
    }

    fun partTwo(input: String) {
    }
}

fun List<String>.mostCommonBit(index: Int): Char =
    map { it.trim()[index] }
        .groupingBy { it }
        .eachCount()
        .entries
        .minByOrNull { it.value }
        ?.key ?: throw NotImplementedError()
