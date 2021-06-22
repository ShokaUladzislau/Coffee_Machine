class Player(val id: Int, val name: String) {

    fun getInfo(): String {
        return "$id, $name, $role"
    }
    companion object {
        var role = "playable character"
    }
}

fun getPlayerInfo(player: Player) = player.getInfo()