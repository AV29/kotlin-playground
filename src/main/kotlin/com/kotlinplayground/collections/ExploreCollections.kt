package org.example.com.kotlinplayground.collections

fun main() {
    val names = listOf("Anton", "Ksu", "Mark")
    println("List: $names")

    val namesMutable = mutableListOf("John", "Denise", "Jane")
    namesMutable.add("XXX")
    println("Mutable List: $namesMutable")

    val set = setOf("Luna", "Luna");
    println("Set: $set")

    val mutableSet = mutableSetOf("Luna", "Luna");
    mutableSet.add("Luna");
    println("Mutable Set: $mutableSet")

    val map = mapOf("Anton" to 36, "Ksu" to 34)
    println("Map: $map")

    val mutableMap = mutableMapOf("Anton" to 36, "Ksu" to 34)
    mutableMap["Mark"] = 4;
    println("Mutable Map: $mutableMap")

}