package less6

class Cat(name: String) : Animal(name) {
    val maxRunDistance = 200

    companion object {
        var countCats = 0
    }

    init {
        countCats++
    }

    override fun maxRunDistance(): Int {
        return maxRunDistance
    }

    override fun run(distance: Int): Boolean {
        return distance > 0 && distance <= this.maxRunDistance
    }

    override fun swim(distance: Int): Boolean {
        return false
    }
}