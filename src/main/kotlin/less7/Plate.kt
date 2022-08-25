package less7

class Plate(food : Int) {
    var food = food
    

    fun decreaseFood(appetit: Int) {
        food -= appetit
    }
    
    fun info(){
        println(this)
    }

    override fun toString(): String {
        return "In plate $food food"
    }
    
    fun addFood(addFood: Int) {
        println("Add $addFood food")
        food +=addFood
        println("Now $food food in plate!")
    }

}