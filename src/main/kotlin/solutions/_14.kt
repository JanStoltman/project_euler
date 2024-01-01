package solutions

fun main() {
    val cache = mutableMapOf<Long, Long>()
    (1L..1_000_000L).asSequence().maxBy { chainLenght(it, cache) }.let { println(it) }
}

fun chainLenght(n: Long, cache: MutableMap<Long, Long>): Long {
    if (n in cache) return cache[n]!!
    if (n == 1L) return 1L

    val res = if (n % 2L == 0L) chainLenght(n / 2, cache) + 1 else chainLenght(n * 3 + 1, cache) + 1
    cache[n] = res
    return res
}