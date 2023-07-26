package Odev2

open class Player(val age: Int, val height: Int, val weight: Int, var salary: Int,val position:String) {

    open fun play() {
        println("Player is playing")
    }

    open fun info() {
        println("Player is info")
    }
}