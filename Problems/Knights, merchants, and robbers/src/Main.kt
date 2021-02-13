fun main() {
    val firstAnswer = readLine()!!.toBoolean()
    val secondAnswer = readLine()!!.toBoolean()
    val confession = readLine()!!.toBoolean()

    val sameOccupation = !(firstAnswer xor secondAnswer)
    println(sameOccupation && !confession)
}
