enum class DangerLevel(name: String, level: Int) {
    HIGH("HIGH", 3),
    MEDIUM("MEDIUM", 2),
    LOW("LOW", 1);

    var dangerLevelLevel = level

    fun getLevel(): Int {
        return dangerLevelLevel
    }

}



