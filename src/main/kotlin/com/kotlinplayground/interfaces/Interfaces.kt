package org.example.com.kotlinplayground.interfaces

import org.example.com.kotlinplayground.classes.Course

interface ICourseRepository {
    val isCoursePersisted: Boolean
    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("Saving course $course...")
        return course.id
    }
}

interface IRepository {
    fun getAll(): List<Course>
}

class SqlCourseRepository: ICourseRepository, IRepository {
    override var isCoursePersisted: Boolean = false

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

    override fun getById(id: Int): Course {
        return Course(id, "Some SQL course", "Anton")
    }

    override fun getAll(): List<Course> {
        TODO("Not yet implemented")
    }
}

class NoSqlCourseRepository: ICourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Some NoSQL course", "Anton")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        println("Saving NoSQL course $course...")
        return course.id;
    }
}

interface A {
    fun doSomething() {
        println("A doing something...")
    }
}

interface B {
    fun doSomething() {
        println("B doing something...")
    }
}

class AB: A, B {
    override fun doSomething() {
        super<A>.doSomething();
        super<B>.doSomething();
        println("AB doing something...")
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val sqlCourse = sqlCourseRepository.getById(1);
    println(sqlCourse);
    val savedSqlCourseId = sqlCourseRepository.save(sqlCourse);
    println("Course persisted: ${sqlCourseRepository.isCoursePersisted}")
    println("Saved SQL course Id: $savedSqlCourseId");

    val noSqlCourseRepository = NoSqlCourseRepository()
    val noSqlCourse = noSqlCourseRepository.getById(2);
    println(noSqlCourse);
    val savedNoSqlCourseId = noSqlCourseRepository.save(noSqlCourse);
    println("Saved NoSQL course Id: $savedNoSqlCourseId");


    val ab = AB();
    ab.doSomething();
}