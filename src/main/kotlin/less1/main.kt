package less1

fun main() {
    printThreeWords()
    checkSumSign()
    printColor()
    compareNumbers()
}

fun printThreeWords() {
    println("Orange\nBanana\nApple")
}

fun checkSumSign() {
    val a = 5
    val b = 8
    val z = a + b
    if (z >= 0) println("summ is positive") else println("summ is negative")
}

fun printColor() {
    val value = 101
    if (value <= 0)
        println("red")
    else if (value in 1..100)
        println("yellow")
    else if (value > 100)
        println("green")

}

fun compareNumbers() {
    val a = 20
    val b = 20
    if (a >= b) println("a >= b") else println("a < b")
}
