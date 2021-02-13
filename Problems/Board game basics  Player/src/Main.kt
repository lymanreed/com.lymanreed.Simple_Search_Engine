data class Player(val id: Int, val name: String, val hp: Int) {

    companion object {
        fun create(name: String): Player {
            val playerID = (1..100).shuffled().first()
            val playerHP = 100
            return Player(playerID, name, playerHP)
        }
    }

}