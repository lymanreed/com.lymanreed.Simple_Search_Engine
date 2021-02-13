fun main() {
    val output = mutableListOf(0, 0, 0)
    repeat(readLine()!!.toInt()) {
        when (readLine()!!.toInt()) {
            0 -> output[0]++
            1 -> output[1]++
            -1 -> output[2]++
        }
    }
    for (i in output.indices) {
        print("${output[i]} ")
    }
}