package solutions

import kotlin.math.sqrt

fun main() {
    val max = Int.MAX_VALUE / 100
    val values = MutableList(max) { true }
    for (i in 2..(sqrt(max.toDouble()).toInt() + 1)) {
        if (values[i]) {
            for (p in ((i * i)until max).step(i)) {
                values[p] = false
            }
        }
    }

    println(values.drop(1).mapIndexed { index, b -> index to b }.filter { it.second }[10001])
}