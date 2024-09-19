package org.example.com.kotlinplayground.scopeFunctions

import org.example.com.kotlinplayground.classes.Course
import org.example.com.kotlinplayground.classes.CourseCategory

fun main() {

    exploreApply()

    exploreLet()

    exploreWith()

    exploreRun()
}

fun exploreApply() {
    val course = Course(
        1,
        "Some name",
        "Anton"
    )

    println("Course: $course")

    course
        .apply {
            courseCategory = CourseCategory.DESIGN
        }
        .also {
            println("Course after also: $it")
        }

    println("Course after apply and also: $course")
}

fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5);

    val result = numbers
        .map { it * 2 }
        .filter { it > 5}
        .let {
            println(it)
            it.sum()
        }


    println(result)

    var name: String? = null;
    name = "Anton";
    val result1 = name.let {
        println(it)
        it.uppercase()
    }

    println(result1);
}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5);

    with(numbers) {
        this
            .map { it * 2 }
            .filter { it > 9 }
            .also { println(it) }

        println(size)
    }
}

fun exploreRun() {
  var numbers: MutableList<Int>? = null; //mutableListOf(1, 2, 3, 4, 5);

    val result = numbers.run {
        numbers = mutableListOf(1, 2, 3)

        numbers?.sum()
    }

    println("Result: $result")
}