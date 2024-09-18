package org.example.com.kotlinplayground.exceptions

fun main(args: Array<String>) {
    println("Name length is: ${nameLength("Anton")}")
    println("Name length is: ${nameLength(null)}")
}

fun nameLength(name: String?): Int? {
    return try {
        name!!.length
    } catch (e: Exception) {
        println(e)
        null;
    }
}