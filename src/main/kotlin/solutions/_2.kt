package solutions

// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610
fun main() {
    var i = 1
    var j = 2
    var sum = 0

    while(j < 4_000_000) {
        if(j % 2 == 0) sum += j
        val tmp = j
        j += i
        i = tmp
    }

    println(sum)
}

