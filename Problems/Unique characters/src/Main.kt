fun main() {
    val input = readLine()!!
    val charMap = mutableMapOf<Char, Int>()
    for (c in input) {
        if (c in charMap.keys) {
            charMap[c] = charMap[c]!! + 1
        } else {
            charMap[c] = 1
        }
    }
    var count = 0
    for (c in charMap.keys) {
        if (charMap[c]!! == 1) {
            count++
        }
    }
    println(count)
}
