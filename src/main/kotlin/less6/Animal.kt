package less6

open class Animal(name: String) {
    var name = name

    companion object {
        var countAnimal = 0
    }

    init {
        countAnimal++
    }

    open fun maxRunDistance(): Int {
        return 0
    }

    open fun maxSwimDistance(): Int {
        return 0
    }

    open fun run(distance: Int): Boolean {
        return false
    }

    open fun swim(distance: Int): Boolean {
        return false
    }
}