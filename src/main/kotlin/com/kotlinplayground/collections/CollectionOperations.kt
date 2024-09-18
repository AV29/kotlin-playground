package org.example.com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.KAFKA
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

//    val designCoursePredicate = { course: Course -> course.category == CourseCategory.DESIGN }
//    exploreFilter(courseList, designCoursePredicate)
//
//    val categoryTransform = {course: Course -> course.category };
//    exploreMap<CourseCategory>(courseList, categoryTransform)
//
//    val doubleTransform = { outerList: List<Int> -> outerList.map { it * it } };
//    exploreFlatMap<Int>(listOf(listOf(1, 2, 3), listOf(4, 5, 6)), doubleTransform)
//
//    val filteredCourses = exploreFlatMap1(courseList, KAFKA);
//    println("Filtered Courses: $filteredCourses")

    val hashMap = exploreHashMap()

}

fun <T>exploreMap(
    courseList: MutableList<Course>,
    transform: (Course) -> T
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

fun <T>exploreFlatMap(lists: List<List<T>>, transform: (List<T>) -> List<T>) {
    lists
        .flatMap { transform.invoke(it) }
        .forEach {
            println("FlatMapped: $it")
        }
}

fun exploreFlatMap1(courseList: List<Course>, topic: String): Set<String> {
    return courseList
        .flatMap { course ->
            course.topicsCovered
                .filter { it == topic }
                .map { course.name }
        }.toSet()
}


fun exploreHashMap() {
    val hashMap = mutableMapOf("Anton" to 36, "Mark" to 4);

    hashMap.forEach { (k, v) -> println("$k: $v") }

    val value = hashMap.getOrDefault("Ksu", 4000);

    println("$value")
    println("${hashMap.containsKey("Ksu")}")

    val filteredKeys = hashMap
        .filterKeys { it.length > 4 }
        .map { it.key.uppercase()}
    println("Filtered keys: $filteredKeys")

    val maxAge = hashMap.maxByOrNull { it.value }?.key
    println("Max Age: $maxAge")
}
