fun main() {
    val times = readLine()!!.toInt()
    val numbers = MutableList(times) { readLine()!!.toInt() }
    if (numbers.size == 1) {
        println(numbers[0])
    } else {
        numbers.sort()
        numbers.reverse()
        println(numbers[0] * numbers[1])
    }
}
