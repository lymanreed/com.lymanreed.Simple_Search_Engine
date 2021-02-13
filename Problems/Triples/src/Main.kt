fun main() {
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    var triples = 0
    for (i in 0..numbers.size - 3) {
        if (numbers[i] == numbers[i + 1] - 1 && numbers[i + 1] == numbers[i + 2] - 1) {
            triples++
        }
    }
    println(triples)
}
