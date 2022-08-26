package less2

fun main() {
    println("Task #1")
    firstHomeWork(5, 6)
    println("Task #2")
    secondHomeWork(1234)
    println("Task #3")
    println(thirdHomeWork(-20))
    println("Task #4")
    forthHomeWork("Put strings to fun", 5)
    println("Task #5")
    fifthHomeWork(2004)
}

fun firstHomeWork(a: Int, b: Int) {
    var isTenTwenty = false
    if (a + b in 10..20) {
        isTenTwenty = true
        println(isTenTwenty)
    } else {
        println(isTenTwenty)
    }
    println()
}

fun secondHomeWork(a: Int) = if (a >= 0) println("Number is positive") else println("Number is negative")

fun thirdHomeWork(a: Int): Boolean {
    var isNegative = true
    return if (a >= 0) {
        isNegative = false
        isNegative
    } else {
        isNegative
    }
}

fun forthHomeWork(s: String, a: Int) {
    for (i in 0 until a)
        println(s)
}


fun fifthHomeWork(year: Int) = if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
    println("Year is not leap") else println("Year is leap")


