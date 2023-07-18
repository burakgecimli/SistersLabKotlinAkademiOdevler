import java.util.Scanner

fun main() {
    /*
     Kullanıcıdan yaşını girmesini isteyecek Girilen yaşa göre, 18 veya daha büyükse "Oy kullanabilirsiniz!"
     mesajını, küçükse "Oy kullanamazsınız." mesajını ekrana yazdırır. Eğer geçerli bir sayı girilmezse,
    "Geçerli bir yaş girmediniz." mesajını ekrana yazdırsın ve sayı dışında text girdiğinde uygulama
     hata vermesin sayı giriniz uyarısı versin Not: try-cacth bloğu kullanılmalı
     */

    val scanner = Scanner(System.`in`)

    try {
        print("Enter your age: ")
        val age = scanner.nextInt()
        if (age >= 18) {
            println("You can vote")
        } else if (age >= 0) {
            println("You can not vote")
        } else {
            println("You have not entered a valid age")
        }
    } catch (e: Exception) {
        println("Please enter a number")
    }

}