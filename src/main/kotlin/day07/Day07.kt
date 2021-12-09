package day07

import kotlin.math.abs

class Day07 {

    fun partOne(positions: List<Int>): Int {
        val maxValue = positions.maxOf { it }
        val temp = mutableListOf<Int?>(null)
        (1 until maxValue).forEach { positionToAlign ->
            val currSum = positions.sumOf { currentPosition ->
                abs(currentPosition - positionToAlign)
            }
            val prevSum = temp.getOrNull(positionToAlign - 1)
            temp.add(positionToAlign, currSum)
            if (prevSum != null && prevSum < currSum) {
                return positionToAlign - 1
            }
        }
        return -1
    }

    fun partTwo(positions: List<Int>): Int {
        val maxValue = positions.maxOf { it }
        var minNum = Int.MAX_VALUE
        (1 until maxValue).forEach { posToAlign ->
            val currSum = positions.sumOf { currPos ->
                sum(abs(currPos - posToAlign))
            }
            if (currSum < minNum) {
                minNum = currSum
            }
        }
        return minNum
    }

    private fun sum(number: Int): Int = if (number == 0) number
    else number + sum(number - 1)
}