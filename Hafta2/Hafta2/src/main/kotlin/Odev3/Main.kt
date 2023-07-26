package Odev3

fun main(){

    /*
    3. Bir "Personel" adlı sınıf oluşturun ve şirketteki personellerin özelliklerini
     (ad, soyad, pozisyon, maaş vb.) içeren nitelikleri ve "maasArttir" gibi işlevi ekleyin.
    */


    val personal1 = Personnel("Ahmet", "Gümüş", "Junior Android Developer", 20000)
    val personal2 = Personnel("Elif", "Aslan", "Senior Android Developer", 50000)


    personal1.info()
    personal1.increaseSalary(5000)
    personal1.info()

    personal2.info()
    personal2.increaseSalary(15000)
    personal2.info()



}