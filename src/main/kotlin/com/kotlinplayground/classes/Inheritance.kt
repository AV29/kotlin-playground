package org.example.com.kotlinplayground.classes

open class User(val name: String) {
    open val isLoggedIn: Boolean = true;

    open fun login() {
        println("Inside login");
    }

    private fun secret() {
        println("Inside secret");
    }

    protected open fun logout() {
        println("Inside logout");
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false

    companion object {
        const val YEAR = 2024
        fun country() = "USA"
    }

    override fun login() {
        super.login();
        println("Inside Student login");
    }

    public override fun logout() {
        super.logout();
        println("Inside Student logout");
    }
}

class Instructor(name: String) : User(name) {
    override fun login() {
        super.login();
        println("Inside Instructor login");
    }
}


fun main() {
    val student = Student("John");
    println("Student's name is ${student.name}")
    student.login();
    student.isLoggedIn = true;
    println(Student.country());
    println(Student.YEAR);
    student.logout()

    val instructor = Instructor("Anton");
    println("Instructor's name is ${instructor.name}")
    instructor.login();

}


