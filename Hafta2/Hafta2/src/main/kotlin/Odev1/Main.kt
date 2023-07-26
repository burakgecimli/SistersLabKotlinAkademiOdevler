package Odev1

fun main(){
    /*
      1.Bir "GeometrikSekil" adlı üst sınıf oluşturun. Ardından "Dikdortgen" ve "Daire" adında iki alt sınıf oluşturun.
      Her alt sınıfın kendine özgü alan ve çevre hesaplayan işlevleri olsun.
      (Dikdörtgen alan = uzunluk x genişlik, çevre = 2 x (uzunluk + genişlik),
      Daire alan = π x yarıçap x yarıçap, çevre = 2 x π x yarıçap)
      Not: ortak kullanılanlar GeometrikSeklin özelliği olacak.
      */

    val circle = Circle(5.12)
    circle.areaCalculator()
    circle.circumferenceCalculator()

    println("------------------------------------")

    val rectangle = Rectangle(6.0, 7.0)
    rectangle.areaCalculator()
    rectangle.circumferenceCalculator()




}