package less3

fun main() {
    println("Task #1")
    invertArray()
    println("Task #2")
    newArray100()
    println("Task #3")
    arrayX2Less6()
    println("Task #4")
    quadArray()
    println("Task #5")
    println((arrayInitValue(40, 12)).asList())
    println("Task #6")
    arrMinMax()
    println("Task #7")
    println(arraBalance(intArrayOf(2, 2, 2, 1, 2, 2, 10, 1)))
    println()
    println("Task #8")
    moveArray(intArrayOf(3, 5, 6, 1), -614)

}

fun moveArray(array: IntArray, n: Int) {
    println("Here is array - ${array.asList()} need to move it on $n elements")
    val number = n % array.size
    if (number >= 0) {
        for (i in 0 until  number) {
            val num = array[array.size - 1]
            var j = array.size - 1
            do{
                array[j] = array[j - 1]
                j--
            } while (j > 0)
            array[0] = num
        }
    } else {
        for (i in number until 0) {
            val num = array[0]
            var j = 0
            do{
                array[j] = array[j + 1]
                j++
            } while (j < array.size - 1)
            array[array.size - 1] = num
        }
    }
    println(array.asList())
}

fun invertArray() {
    var arr = intArrayOf(1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1)
    println("${arr.asList()} - normal array")
    for (i in arr.indices) {
        if (arr[i] == 1) {
            arr[i] = 0
        } else
            arr[i] = 1
    }
    println("${arr.asList()} - invert array")
    println()
}

fun newArray100() {
    var newArr = IntArray(100)
    for (i in newArr.indices)
        newArr[i] = i + 1
    println(newArr.asList())
    println()
}

fun arrayX2Less6() {
    var a = intArrayOf(1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1)
    println(a.asList())
    for (i in a.indices)
        if (a[i] < 6)
            a[i] *= 2
    println(a.asList())
    println()
}

fun quadArray() {
    val array = Array(10, { Array(10, { 0 }) })
    for (i in array.indices)
        for (j in array[i].indices) {
            array[i][array[j].size - (i + 1)] = 1
            if (j == i) {
                array[i][j] = 1
                println(array[j].asList())
            }
        }
    println()
}

fun arrayInitValue(len: Int, value: Int): IntArray {
    val array = IntArray(len, { value })
    return array
}

fun arrMinMax() {
    val array = intArrayOf(140, 56, 430, 78, 13, -32, 45)
    println(array.asList())
    var min = array[0]
    var max = array[0]
    for (i in array.indices) {
        if (array[i] > max) max = array[i]
        if (array[i] < min) min = array[i]
    }
    println("Max number - $max, min number - $min")
    println()
}

fun arraBalance(array: IntArray): Boolean {
    println(array.asList())
    var lSum = 0
    for (i in array.indices) {
        lSum += array[i]
        var rSum = 0
        for (j in i + 1 until array.size)
            rSum += array[j]
        if (lSum == rSum) {
            println("On ${i + 1} element of array, sum of left and right parts are equal $lSum")
            println()
            return true
        }
    }
    println("Left and right parts are not equal")
    return false
}
