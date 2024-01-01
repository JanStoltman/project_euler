package solutions

import kotlin.math.sqrt

fun main() {
    var sum = 1L
    (2..Int.MAX_VALUE).find {
        sum += it
        findDivisors(sum) > 500
    }.let { println(sum) }
}

fun findDivisors(n: Long): Int {
    var counter = 0
    var i = 2L
    while (i <= sqrt(n.toDouble())) {
        if (n % i == 0L) {
            counter++
            if (i != (n / i)) {
                counter++
            }
        }

        i++;
    }

    if (n > 1) {
        counter++
    }

    if (n >= 1) {
        counter++
    }

    return counter
}