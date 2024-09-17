package org.example.com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    val designCoursePredicate = { course: Course -> course.category == CourseCategory.DESIGN }
    exploreFilter(courseList, designCoursePredicate)

    val categoryTransform = {course: Course -> course.category };
    exploreMap(courseList, categoryTransform)
}



fun exploreMap(
    courseList: MutableList<Course>,
    transform: (Course) -> Any
) {

    val result = courseList
        // .map { it.category }
        .map { transform.invoke(it) }
        .forEach {
            println("Mapped Course: $it")
        }

    println(courseList)
    println(result)
}


fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {

    courseList
        //.filter { it.category == CourseCategory.DEVELOPMENT }
        .filter(predicate)
        .forEach {
            println("Dev Course: ${it.name}")
        }
}