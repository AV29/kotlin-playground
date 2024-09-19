package org.example.com.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKET
}

fun main() {
    val course = Course(1, "Reactive Programming", "Anton V")

    println(course)

    val course1 = Course(2, "Reactive Programming", "Anton V")

    println("Checking for equality: ${course1 == course}")

    val course2 = course1.copy(author = "Anton V");

    println("Checking for equality: ${course1 == course2}")
}