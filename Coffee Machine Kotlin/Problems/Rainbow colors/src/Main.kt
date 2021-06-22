enum class Rainbow(val color: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");

}
fun main() {
    val color = readLine()!!
    var result: Boolean = false

    for (enum in Rainbow.values()) {
        if (color == enum.color){
            result = true
        }
    }

    println(result)
}