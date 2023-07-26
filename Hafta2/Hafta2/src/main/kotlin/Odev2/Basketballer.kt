package Odev2

class Basketballer(private val isAllStar: Boolean, age: Int, height: Int, weight: Int, salary: Int, position: String) :
    Player(age, height, weight, salary, position) {

    override fun play() {
        println("Basketballer is playing")
    }

    override fun info() {

        println("Age:$age \nHeight:$height \nWeight:$weight \nSalary:$salary \nPozition:$position")
        isAllStarInfo()
    }

   private fun isAllStarInfo() {
        if (isAllStar) {
            println("This basketball is an allstar")
        } else {
            println("This basketball is not an allstar")
        }
    }


}