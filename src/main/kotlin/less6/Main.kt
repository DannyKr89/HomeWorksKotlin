package less6

import java.util.Scanner

var sc = Scanner(System.`in`)
var distance = 0

fun main() {
    do {
        println("Add new Animal?\n1 - Cat\n2 - Dog\n3 - exit")
        var ask = sc.nextInt()
        if (ask == 1) {
            makeCat()
        }
        if (ask == 2) {
            makeDog()
        }
    } while (ask != 3)
    println("Animals - ${Animal.countAnimal} \nCats - ${Cat.countCats} \nDogs - ${Dog.countDogs}")
    sc.close()
}

fun makeCat() {
    print("Input name of the Cat -")
    val animal = Cat(sc.next())
    run(animal)
    swim(animal)
}

fun makeDog() {
    print("Input name of the Dog -")
    val animal = Dog(sc.next())
    run(animal)
    swim(animal)
}

fun run(animal: Animal) {
    print("Input run distance - ")
    distance = sc.nextInt()
    if (animal.run(distance)){
        println("${animal.name} can run $distance km")
    } else {
        println("${animal.name} can't run $distance km. Max distance is ${animal.maxRunDistance()}")
    }
}

fun swim(animal: Animal) {
    if (animal is Cat) {
        println("Cats can't swim :(")
    } else {
        print("Input swim distance - ")
        distance = sc.nextInt()
        if (animal.run(distance)) {
            println("${animal.name} can swim $distance km")
        } else {
            println("${animal.name} can't swim $distance km. Max distance is ${animal.maxSwimDistance()}")
        }
    }
}
