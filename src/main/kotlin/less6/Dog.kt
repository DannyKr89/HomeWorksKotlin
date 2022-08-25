package less6

class Dog(name: String) : Animal(name) {
    val maxRunDistance = 500
    val maxSwimDistance = 10

    companion object{
        var countDogs = 0
    }

    init {
        countDogs++
    }

    override fun maxRunDistance(): Int {
        return maxRunDistance
    }

    override fun maxSwimDistance(): Int {
        return maxSwimDistance
    }

    override fun run(distance: Int): Boolean {
        return distance > 0 && distance <= this.maxRunDistance
    }

    override fun swim(distance: Int): Boolean {
        return distance > 0 && distance <= this.maxSwimDistance
    }
}