package less7

import kotlin.random.Random

class Cat(name : String = "Cat") {
    val name: String = name
    private var isSatiety = false
    private val appetit:Int = Random.nextInt( 2,8) * 10

    fun eat(plate: Plate){
        if (appetit <= plate.food){
            plate.decreaseFood(appetit)
            println("$name eat $appetit food\n")
            isSatiety = true
        } else {
            println("$name not enough $appetit food to satiety\n")
            isSatiety = false
        }
    }

    fun isSatiety(): Boolean {
        return isSatiety
    }
}