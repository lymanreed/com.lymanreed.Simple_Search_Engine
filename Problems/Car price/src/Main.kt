fun main() {
    val param = readLine()!!
    val value = readLine()!!.toInt()

    println(
        when (param) {
            "old" -> getPrice(age = value)
            "passed" -> getPrice(kms = value)
            "speed" -> getPrice(maxSpeed = value)
            "auto" -> getPrice(autoTrans = value)
            else -> getPrice()
        }
    )
}

fun getPrice(age: Int = 5, kms: Int = 100_000, maxSpeed: Int = 120, autoTrans: Int = 0) =
    20_000 - age * 2000 + (maxSpeed - 120) * 100 - kms / 10_000 * 200 + autoTrans * 1500
