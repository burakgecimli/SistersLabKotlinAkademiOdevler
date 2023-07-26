package Odev3

class Personnel(
    val name: String,
    val surName: String,
    val department: String,
    var salary: Int
) {

   fun increaseSalary(rise: Int) {
        salary += rise
    }

    fun info() {
        println("Name:$name Surname:$surName Department:$department Salary:$salary")
    }


}