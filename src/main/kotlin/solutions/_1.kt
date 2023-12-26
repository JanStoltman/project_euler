package solutions

fun main() {
    val res = 3 * uSum(999 / 3) + 5 * uSum(999 / 5) - 15 * uSum(999 / 15)
    assert(res == 233168)
    println("$res")
}

private fun uSum(n: Int): Int = (n * (n + 1)) / 2