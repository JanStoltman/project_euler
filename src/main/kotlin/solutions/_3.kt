package solutions

fun main() {
    var target = 600851475143L //13195
    var i = 2L

    while (i * i < target) {
        if (target % i != 0L) {
            i++
        } else {
            target /= i
        }
    }

    println(target)
}