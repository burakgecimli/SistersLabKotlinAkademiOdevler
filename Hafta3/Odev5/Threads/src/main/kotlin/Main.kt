fun main(args: Array<String>) {

    /*
    Asenkron olarak uzun süren bir işlemi gerçekleştiren thread oluşturuyoruz.
    Bu kodda, iki farklı thread oluşturacağız ve her biri uzun süreli bir işlemi temsil edecek.
    İlk thread 5 saniye uyuyacak, ikinci thread ise 3 saniye uyuyacak.
    Ana thread, diğer threadler çalışırken devam edecek ve tüm threadlerin bitmesini beklemek
    için 6 saniye uyuyacak.
    Bu şekilde, asenkron olarak uzun süren işlemler gerçekleştirsin.
     */


    val thread1 = Thread1()
    thread1.start()

    val thread2 = Thread2()
    thread2.start()

    for (item in 1..10) {
        println("Main thread item: $item")
        Thread.sleep(6000)

    }


}