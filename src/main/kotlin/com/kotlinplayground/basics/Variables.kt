package org.example.com.kotlinplayground.basics

import org.example.com.kotlinplayground.functions.courseName
import org.example.com.kotlinplayground.functions.topLevelFunction

fun main() {
    val name: String = "Anton";

    println(name);

    var age: Int = 36;

    println(age);

    age = 35;

    println(age);

    val salary: Long = 30000L;

    println(salary);

    val course = "Kotlin Spring";

    println("course: $course and the course length is ${course.length}");

    val multilineString = """
        ABS
        DFG
        dfgdfg
    """.trimIndent()

    println(multilineString);

    println(topLevelFunction());

    println("Top level Value from another file: $courseName");
}