package org.example.com.kotlinplayground.basics

fun main() {
    var name = "Anton";

    //name = "123"
    val result = if(name.length == 5) {
        println("Name is 5 chars");
        name
    } else  {
        println("Name is not 5 chars");
        name
    }

    println("result: $result")

    val position = 3;

    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println("result: $medal")
}