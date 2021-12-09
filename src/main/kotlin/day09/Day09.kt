package day09

class Day09 {
    fun partOne(input: String): Int =
        with(Ground(input)) {
            points.filter { point ->
                point.isLowestInNeighborhood(this)
            }.sumOf { it.value.countRiskLevel() }
        }

    fun partTwo(input: String): Int =
        with(Ground(input)) {
            Ground(input).points.mapNotNull { point ->
                if (point.isLowestInNeighborhood(this)) {
                    countBasin(this, point)
                } else null
            }.sortedDescending().take(3).reduce(Int::times)
        }
}

private fun Int.countRiskLevel() = this + 1

private fun countBasin(
    ground: Ground,
    startPoint: Point,
    checkedPoints: MutableMap<Point, Boolean> = mutableMapOf()
): Int {
    with(startPoint) {
        ground.getPointsAround(this).forEach {
            if (it.value < 9 && !checkedPoints.contains(it)) {
                checkedPoints[it] = true
                countBasin(ground, it, checkedPoints)
            }
        }
    }
    return checkedPoints.size
}