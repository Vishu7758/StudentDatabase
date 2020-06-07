package student

abstract class Person(open val firstName: String, open val lastName: String, open val mobileNo: String)

class Student(
    val studentId: String,
    override val firstName: String,
    override val lastName: String,
    override val mobileNo: String
) : Person(
    firstName,
    lastName,
    mobileNo
) {
    fun printDetails() {
        println("$firstName\t\t$lastName\t\t$studentId\t\t\t$mobileNo")
    }
}