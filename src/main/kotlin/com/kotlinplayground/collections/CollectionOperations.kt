package org.example.com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    val devCoursePredicate = { course: Course -> course.category == CourseCategory.DEVELOPMENT }
    val designCoursePredicate = { course: Course -> course.category == CourseCategory.DESIGN }
    exploreFilter(courseList, designCoursePredicate)
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {

    courseList
        //.filter { it.category == CourseCategory.DEVELOPMENT }
        .filter { predicate.invoke(it) }
        .forEach {
            println("Dev Course: ${it.name}")
        }
}