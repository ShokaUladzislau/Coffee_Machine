fun main(args: Array<String>) {
    val speed = readLine().toString()
    var limit = readLine().toString()

    if (limit == "no limit") {
        limit = "60"
    } else {
        limit = limit
    }

    checks(speed, limit)
}

fun checks(speed: String = "0", limit: String = "60") {

    val s = speed.toInt()
    val l = limit.toInt()
    val d = s - l

    if (s <= l) println("Within the limit") else println("Exceeds the limit by $d kilometers per hour")

}

