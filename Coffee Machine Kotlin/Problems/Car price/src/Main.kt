fun main(args: Array<String>) {

    val parameter = readLine()
    val value = readLine()!!.toInt()

    when (parameter) {
        "old" -> auto(old = value)
        "passed" -> auto(kilometers = value)
        "speed" -> auto(maximumSpeed = value)
        "auto" -> auto(automaticTransmission = value)
    }
}

fun auto(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automaticTransmission: Int = 0) {

    var price = 20000
    price -= (old) * 2000 + 1000
    if (maximumSpeed < 120) price -= (120 - maximumSpeed) * 100 else price += (maximumSpeed - 120) * 100
    price -= kilometers / 10000 * 200 - 1000
    if (automaticTransmission == 1) price += 1500


    println(price)

}
