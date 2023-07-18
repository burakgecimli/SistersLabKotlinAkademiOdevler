import java.util.Scanner

fun main(args: Array<String>) {
    /*
   .Dışardan kullanıcı adı ve şifre girişi alınacak, girilen bu kullanıcı adı ve şifre önceden belirlenen
    kullanıcı adı ve şifreyle  eşleştirilecek.
   .Kullanıcı adında büyük-küçük harf farkı göz ardı edilecek, ancak şifrede büyük-küçük harf farkı
    olması gerekmektedir.Kullanıcı adı ve şifre daha önce belirlenen kullanıcı adı ve şifreyle
    uyuşuyorsa hoş geldiniz diyecek eşleşmiyorsa kullanıcı adı veya şifre hatalı uyarı verecek program yazılmalı.
     */

    val scanner = Scanner(System.`in`)

    val validUserName = "burak"
    val validPassword = "brk123"

    print("Enter your user name: ")
    val userName = scanner.next()

    print("Enter your password: ")
    val password = scanner.next()

    val isValidUserNameOk = validUserName.equals(userName, ignoreCase = true)
    val isValidPasswordOk = validPassword.equals(password)

    if (isValidUserNameOk && isValidPasswordOk) {
        println("Welcome")
    } else {
        println("Your username or password is fail")
    }


}