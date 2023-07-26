package Odev5

fun main() {
    /*
       5.Bir "Kullanici" adlı sınıf oluşturun ve ad ve soyad gibi özellikleri içeren nullable özellikler tanımlayın.
       Kullanıcı adı ve soyadı null olabileceğini göz önünde bulundurarak bu özelliklere nasıl erişebilirsiniz?

    */

    val user = User(null, null)

    val isConditonOk = user.name != null && user.surName != null

    if (isConditonOk) {
        user.info()
    } else {
        println("Values should not null")
    }


}
