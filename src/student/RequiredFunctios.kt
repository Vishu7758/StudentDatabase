package student

fun addStudent() : Student {
    print("Enter first name of student : ")
    val fName:String = readLine()!!.toString()
    print("Enter last name of student : ")
    val lName:String = readLine()!!.toString()
    print("Enter student ID (RollNO) : ")
    val studId:String = readLine()!!.toString()
    print("Enter mobile number : ")
    val mobNo:String = readLine()!!.toString()

    return Student(studentId = studId, firstName = fName, lastName = lName, mobileNo = mobNo)
}

fun displayMenu() {
    println("\n\n1.Add student to database\n2.Remove Student from database\n3.Display student database\n4.Exit")
}

fun List<Student>.removeStudent(): Int {
    this.showDatabase()
    print("Enter student ID to remove student : ")
    val temp = readLine()!!.toString()
    return this.indexOfFirst { it.studentId == temp }
}

fun List<Student>.showDatabase() {
    println("First Name\tLast Name\tStudent ID\tMobile No")
    for (item in this) {
        item.printDetails()
    }
}
