import student.*

fun main() {
    val studentList = mutableListOf<Student>()
    loop@ while (true) {
        displayMenu()
        val choice = readLine()!!.toInt()
        when (choice) {
            1 -> studentList.add(addStudent())
            2 -> studentList.removeAt(studentList.removeStudent())
            3 -> studentList.showDatabase()
            4 -> break@loop
            else -> println("Wrong Choice")
        }
    }
}