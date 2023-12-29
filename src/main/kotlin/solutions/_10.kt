package solutions

import kotlin.math.sqrt

fun main() {
    val max = 2_000_000
    val values = MutableList(max) { true }
    for (i in 2..(sqrt(max.toDouble()).toInt())) {
        if (values[i]) {
            for (p in ((i * i)until max).step(i)) {
                values[p] = false
            }
        }
    }

    println(values.mapIndexed { index, b -> index.toLong() to b }.drop(2).filter { it.second }.sumOf { it.first })
}