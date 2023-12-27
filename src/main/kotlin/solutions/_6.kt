package solutions

fun main() {
    val i = 100
    println(sumSquared(i) - squareSum(i))
}

private fun sumSquared(n: Int) = (1..n).sum().let { it * it }
private fun squareSum(n: Int) = (1..n).sumOf { it * it }