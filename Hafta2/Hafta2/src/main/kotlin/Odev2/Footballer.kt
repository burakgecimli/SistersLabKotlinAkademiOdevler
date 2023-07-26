package Odev2

class Footballer(private var score: Int, age: Int, height: Int, weight: Int, salary: Int, position: String) :
    Player(age, height, weight, salary, position) {

    override fun play() {
        println("Footballer is playing")
    }

    override fun info() {
        println("Age:$age \nHeight:$height \nWeight:$weight \nSalary:$salary \nPozition:$position \nScore:$score")
    }

    fun makeScore() {
        score++
    }


}