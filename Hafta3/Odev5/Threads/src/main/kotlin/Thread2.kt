class Thread2 : Thread() {

    override fun run() {
        for (item in 1..10) {

            println("Thread2 item: $item")
            sleep(3000)

        }
    }


}