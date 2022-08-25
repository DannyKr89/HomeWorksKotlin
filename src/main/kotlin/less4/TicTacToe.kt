package less4

import java.util.Scanner
import kotlin.random.Random

const val X = 'X'
const val O = 'O'
const val SPACE = '.'
const val winSize: Int = 3
var map: Array<Array<Char>> = Array(3) { Array(3) { SPACE } }
var size: Int = 3
var countTurns: Int = 0
var lastRow: Int? = null
var lastCol: Int? = null
var row: Int = 0
var col: Int = 0
var random = Random(size)
var sc = Scanner(System.`in`)


fun main() {
    do {
        initMap()
        drawMap()
        startGame()

    } while (playAgain())
    sc.close()
}

fun initMap() {
    map = Array(3) { Array(3) { SPACE } }
}

fun startGame() {
    countTurns = 0
    while (true) {
        yourTurn()
        drawMap()
        if (chckWin(X)) {
            println("Congratulation! You WIN!!")
            break
        }
        if (mapIsFull()) {
            println("It's a draw")
            break
        }
        aiTurn()
        drawMap()
        if (chckWin(O)) {
            println("AI WIN!!")
            break
        }
        if (mapIsFull()) {
            println("It's a draw")
            break
        }
    }
}

fun aiTurn() {
    do {
        row = random.nextInt(size)
        col = random.nextInt(size)
    } while (!rowAndColIsValid(row, col, O))
    map[row][col] = O
    countTurns++
    lastRow = row
    lastCol = col
    println("AI turn ${row + 1} ${col + 1}")
}

fun mapIsFull(): Boolean {
 return countTurns >= size * size
}

fun chckWin(symb: Char): Boolean {
    return (winX(symb) || winY(symb) || diagD(symb) || diagU(symb))
}

fun winX(symb: Char): Boolean {
    var win = 0
    for (i in 0 until size) {
        if (map[lastRow!!][i] == symb) {
            win++
            if (win == winSize) {
                return true
            }
        } else {
            win = 0
        }
    }
    return false
}

fun winY(symb: Char): Boolean {
    var win = 0
    for (i in 0 until size) {
        if (map[i][lastCol!!] == symb) {
            win++
            if (win == winSize) {
                return true
            }
        } else {
            win = 0
        }
    }
    return false
}


fun diagD(symb: Char): Boolean {
    var win = 0;
    for (i in 0 until size) {
        var j = i
        if (map[i][j] == symb) {
            win++;
            if (win == winSize) {
                return true;
            }
        } else {
            win = 0;
        }
    }
    return false;
}

fun diagU(symb: Char): Boolean {
    var win = 0;
    for (i in 0 until size) {
        var j = size - 1 - i
        if (map[i][j] == symb) {
            win++;
            if (win == winSize) {
                return true;
            }
        } else {
            win = 0;
        }
    }
    return false;
}


fun drawMap() {
    for (i in 0..size) {
        print(i)
    }
    println()
    for (i in 0 until size) {
        print(i + 1)
        for (j in 0 until size) {
            print(map[i][j])
        }
        println()
    }
    println()
}

fun playAgain(): Boolean {
    println("Play again?")
    return sc.next().equals("y")
}


fun yourTurn() {
    do {
        println("Input a row -")
        row = sc.nextInt() - 1
        println("Input a col -")
        col = sc.nextInt() - 1
    } while (!rowAndColIsValid(row, col, X))
    map[row][col] = X
    countTurns++
    lastRow = row
    lastCol = col

}

fun rowAndColIsValid(row: Int?, col: Int?, symb: Char): Boolean {
    if (symb == X) {
        if (row!! >= 0 && row < size && col!! >= 0 && col < size) {
            if (map[row][col] == SPACE) {
                return true
            } else {
                println("This cell is no empty!")
                return false
            }
        } else {
            println("Input from 1 to 3")
            return false
        }
    } else {
        return row!! >= 0 && row < size && col!! >= 0 && col < size && map[row][col] == SPACE
    }

}

