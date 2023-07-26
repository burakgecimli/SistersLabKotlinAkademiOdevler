package Odev2

fun main() {

    val footballer = Footballer(2, 25, 178, 76, 1000000, "Forward")

    footballer.play()
    footballer.info()

    println("----------")

    footballer.makeScore()
    footballer.makeScore()
    footballer.info()

    println("----------")

    val basketballer = Basketballer(true, 28, 198, 95, 1234567, "Pivot")
    basketballer.play()
    basketballer.info()

}