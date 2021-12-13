package day13

import kotlin.math.abs

class Day13 {

    fun partOne(input: String): Int {
        val sheet = input.points
        val (direction, size) = input.folds.first()
        val result = fold(sheet, direction, size)
        return result.size
    }

    fun partTwo(input: String) {
        var sheet = input.points
        input.folds.forEach {
            sheet = fold(sheet, it.first, it.second)
        }
        printSheet(sheet)
    }

    private fun printSheet(sheet: Set<Pair<Int, Int>>) {
        val maxX = sheet.maxOf { it.first }
        val maxY = sheet.maxOf { it.second }
        (0..maxY).forEach { y ->
            (0..maxX).forEach { x ->
                if (sheet.any { it.first == x && it.second == y })
                    print("#")
                else print(".")
            }
            println()
        }
    }

    private fun fold(points: Set<Pair<Int, Int>>, direction: String, size: Int) =
        points.map { (x, y) ->
            if (direction == "x") size - abs(x - size) to y
            else x to size - abs(y - size)
        }.toSet()

    private val String.points
        get() = this.lines().filter { it.isNotBlank() && !it.startsWith("fold") }
            .map {
                it.split(",")
                    .map { x -> x.toInt() }
            }
            .map { it[0] to it[1] }
            .toSet()

    private val String.folds
        get() = this.lines()
            .filter { it.startsWith("fold") }
            .map { it.split("fold along ")[1] }
            .map { it.split("=") }
            .map { it[0] to it[1].toInt() }
}