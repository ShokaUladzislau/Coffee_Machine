fun main() = Array(4) { readLine()!! }.let { concat3(it[0], it[1], it[2], it[3]).let(::println) }

fun concat3(s1: String, s2: String, s3: String, separator: String) =
        arrayOf(s1, s2, s3).joinToString(if (separator == "NO SEPARATOR") " " else separator)
