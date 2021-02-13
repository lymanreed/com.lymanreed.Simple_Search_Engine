fun main() {
    val letter = readLine()!!.first().toLowerCase()
    val alphabet = ('a'..'z').toList()
    val vowels = "aeiou"
    if (letter in vowels) {
        println(alphabet.indexOf(letter) + 1)
    } else {
        println(0)
    }
}
