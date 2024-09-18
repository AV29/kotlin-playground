package org.example.com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.courseList

fun main() {
    val namesListSequence = listOf("Anton", "Pasha", "Denis", "Mark")
        .asSequence()
        .filter { it.length > 4 }
        .map { it.uppercase() }
        .toList()

    println(namesListSequence)

    exploreFilterWithSequence(courseList(), { c -> c.name.length > 4 });

    val range = 1..1000_000_000

    range
        .asSequence()
        .map{ it.toDouble() }
        .take(40)
        .forEach { println("Value is: $it") }
}

fun exploreFilterWithSequence(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {

    courseList
        .asSequence()
        .filter(predicate)
        .forEach {
            println("Dev Course: ${it.name}")
        }
}