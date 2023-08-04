class Thread1 : Thread() {

    override fun run() {
        for (item in 1..10) {

            println("Thread1  item: $item")
            sleep(5000)

        }
    }

}