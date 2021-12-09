package day09

data class Point(val y: Int, val x: Int, val value: Int) {

    fun isLowestInNeighborhood(ground: Ground): Boolean =
        value.isLowerThanAll(*ground.getPointsAround(this).map { it.value }.toTypedArray())
}

private fun Int.isLowerThanAll(vararg adjs: Int?): Boolean =
    adjs.all { adj -> adj?.let { it > this } ?: true }