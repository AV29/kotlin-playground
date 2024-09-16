package org.example.com.kotlinplayground.collections

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y);
}

fun main() {
    val addLambda: (Int, Int) -> Int = { x, y ->
        println("Inside lambda ${x + y}")
        x + y
    }

    println(addLambda(2, 3));

    val sum = calculate(13, 2, addLambda);
    println(sum);

    val product = calculate(13, 2) { a, b -> a * b }
    println(product);
}