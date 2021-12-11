package day01

import java.util.*

class Day01 {
    fun partOne(input: List<Int>) =
        with(LinkedList(input)) {
            mapIndexedNotNull { index, i ->
                val iter = listIterator(index)
                if (iter.hasPrevious())
                    iter.previous() < i
                else null
            }.count { it }
        }

    fun partTwo(input: List<Int>) =
        (1..input.size - 3).map { index ->
            val nextSum = input.slice(index..index + 2).sum()
            val prevSum = input.slice(index - 1..index + 1).sum()
            prevSum < nextSum
        }.count { it }
}
