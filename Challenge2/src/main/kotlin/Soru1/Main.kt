package Soru1

fun main() {
    /*

    Bir "MuzikAleti" adlı üst sınıf oluşturun ve bu sınıfta müzik aletlerinin ses çıkarma
    özelliği için "sesCikar" adında bir metot tanımlayın. Ardından "Gitar" ve "Piyano" adlı
    iki alt sınıf oluşturun. Her bir alt sınıf, "sesCikar" metotunu kendi türüne uygun
    şekilde ezerek (override ederek) kendi sesini çıkartsın. Bir "MuzikDersi" adlı sınıf
     oluşturun ve bu sınıfta "sesCikar" metodu parametre olarak aldığı müzik
     aleti nesnesini çağırarak müzik aletinin sesini çıkartsın.
     Polymorphism özelliğini kullanarak bu sınıfları nasıl bir arada kullanabilirsiniz?
     */

    val muzikDersi = MuzikDersi()


    val gitar:MuzikAleti = Gitar()
    val piyano:MuzikAleti = Piyano()


    muzikDersi.sesCikar(gitar)
    muzikDersi.sesCikar(piyano)



}