fun main() {
    var name = readLine()
    if (name != null) {
        hellofunction(name)
    }
}

fun hellofunction(name: String) {
 if (name == "HIDDEN") println("Hello, secret user!") else println("Hello, $name!")
}
