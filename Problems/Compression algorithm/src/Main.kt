fun main() {
    val input = readLine()!!
    if (input.isNotEmpty()) {
        var result = ""
        var current = input[0]
        var count = 1
        for (i in 1 until input.length)
            if (input[i] == current) {
                count++
            } else {
                result += "$current$count"
                current = input[i]
                count = 1
            }
        println("$result$current$count")
    }
}
