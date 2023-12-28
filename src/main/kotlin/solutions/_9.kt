package solutions

import kotlin.math.sqrt

fun main() {

    for (b in 1..500) {
        for (a in 1 until b) {
            if (a + b + sqrt((a * a + b * b).toDouble()) == 1000.0) {
                println("$a $b ${sqrt((a * a + b * b).toDouble())}")
                println("${a * b * sqrt((a * a + b * b).toDouble()).toInt()}")
            }
        }
    }
}