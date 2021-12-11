package day02

class Day02 {
    fun partOne(input: String): Int {
        var (depth, horizontal) = arrayOf(0, 0)
        input.lines().forEach {
            val (action, stringValue) = it.split(" ")
            val value = stringValue.toInt()
            when (action) {
                "forward" -> horizontal += value
                "down" -> depth += value
                "up" -> depth -= value
                else -> throw NotImplementedError()
            }
        }
        return depth * horizontal
    }

    fun partTwo(input: String): Int {
        var (depth, horizontal, aim) = arrayOf(0, 0, 0)
        input.lines().forEach {
            val (action, stringValue) = it.split(" ")
            val value = stringValue.toInt()
            when (action) {
                "forward" -> {
                    horizontal += value
                    depth += aim * value
                }
                "down" -> aim += value
                "up" -> aim -= value
                else -> throw NotImplementedError()
            }
        }
        return depth * horizontal
    }
}