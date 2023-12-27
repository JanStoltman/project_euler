package solutions

import kotlin.math.abs

fun main() {
    val lcm = lcm(*(1L until 20L).toList().toLongArray())
    println(lcm)
}


private fun lcm(vararg nums: Long): Long {
    var s = 1L
    for (i in nums) {
        s = lcm(s, i)
    }
    return s
}

private fun lcm(i: Long, j: Long): Long {
    if (i == 0L && j == 0L) return 0L

    return abs(i * j) / gcd(i, j)
}

private fun gcd(i: Long, j: Long): Long {
    if (i == 0L) return j
    if (j == 0L) return i
    return gcd(j, i % j)
}