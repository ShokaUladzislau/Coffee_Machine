data class City(val name: String) {
    var population: Int = 0
        get() {
            return field
        }
        set(value) {
            if (value > 50_000_000) {
                field = 50_000_000
            } else if (value < 0) {
                field = 0
            } else {
                field = value
            }
        }
}
