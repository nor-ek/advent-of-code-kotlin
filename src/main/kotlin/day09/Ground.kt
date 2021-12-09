package day09

class Ground(val points: List<Point>) {
    constructor(input: String) : this(
        points = input.lines().flatMapIndexed { y: Int, s: String ->
            s.toIntList().mapIndexed { x, i -> Point(y, x, i) }
        }
    )

    private fun getPoint(y: Int, x: Int): Point? = points.firstOrNull {
        it.x == x && it.y == y
    }

    fun getPointsAround(point: Point): List<Point> = listOfNotNull(
        getPoint(point.y + 1, point.x),
        getPoint(point.y - 1, point.x),
        getPoint(point.y, point.x + 1),
        getPoint(point.y, point.x - 1)
    )
}

private fun String.toIntList(): List<Int> = toCharArray().map { it.digitToInt() }