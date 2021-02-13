fun main() {
    var wallet = readLine()!!.toInt()
    val purchases = readLine()!!.split(" ")
    var totalPurchase = 0
    var overage = 0

    for (purchase in purchases) {
        if (wallet >= purchase.toInt()) {
            totalPurchase += purchase.toInt()
            wallet -= purchase.toInt()
        } else {
            overage += purchase.toInt()
        }
    }

    println(if (overage == 0) {
        "Thank you for choosing us to manage your account! You have $wallet money."
    } else {
        "Error, insufficient funds for the purchase. You have $wallet, but you need $overage."
    })
}
