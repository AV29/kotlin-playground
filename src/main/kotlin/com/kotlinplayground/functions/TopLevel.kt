package org.example.com.kotlinplayground.functions

const val courseName = "Kotlin Program";

fun topLevelFunction(): Int {
    return (0..100).random();
}

fun main() {

    val num = topLevelFunction();

    println(num);
}