enum class DangerLevel(private val theLevel: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel() = theLevel
}
