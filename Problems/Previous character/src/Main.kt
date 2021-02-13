fun main() {
    val characters = List(4) { readLine()!!.first() }
    for (character in characters) {
        println(character - 1)
    }
}
