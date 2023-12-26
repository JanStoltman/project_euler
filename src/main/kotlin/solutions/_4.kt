package solutions

fun main() {
    var max = 0

    for (i in 100..999) {
        for (j in 100..999) {
            val res = i * j
            if (isPalindrome(res) && res > max) max = res
        }
    }

    println("$max")
}

private fun isPalindrome(num: Int): Boolean {
    var tmp = num
    var rev = 0;
    while (tmp > 0) {
        val dig = tmp % 10;
        rev = rev * 10 + dig;
        tmp /= 10;
    }

    return rev == num
}
