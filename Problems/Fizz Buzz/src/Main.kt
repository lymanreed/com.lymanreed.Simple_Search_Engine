fun main() {
    val (start, end) = listOf(readLine()!!.toInt(), readLine()!!.toInt())

    for (i in start..end) {
        println(
            when {
                i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
                i % 3 == 0 -> "Fizz"
                i % 5 == 0 -> "Buzz"
                else -> i
            }
        )
    }
}