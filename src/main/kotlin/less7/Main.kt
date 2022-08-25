package less7

import kotlin.random.Random

val cats = Array<Cat>(4,{Cat()})

fun main() {
    cats[0] = Cat("Murz")
    cats[1] = Cat("Bars")
    cats[2] = Cat("Shar")
    cats[3] = Cat("Tom")
    val plate = Plate(100)
    Thread.sleep(1000)
    plate.addFood(Random.nextInt(2,6) * 10)
    Thread.sleep(1000)
    for (cat in cats){
        cat.eat(plate)
        Thread.sleep(1000)
        plate.info()
    }
    for (cat in cats){
        if (cat.isSatiety()){
            println("${cat.name} is satiety")
        }else{
            println("${cat.name} is hungry")
        }
    }
}
