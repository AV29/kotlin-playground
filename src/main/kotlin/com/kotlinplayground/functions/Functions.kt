package org.example.com.kotlinplayground.functions

import java.time.LocalDate

fun addition(a: Int, b: Int): Int {
    return a + b;
}

fun additionV2(a: Int, b: Int) = a + b;


fun printName(name: String) = println("Name is: $name");

fun printPersonDetails(name: String, email: String = "", dob: LocalDate = LocalDate.now()) {
    println("Name: $name, email: $email, dob: $dob")
}

fun main() {
//    println("this is a unit/void: ${printName("Anton")}")
//
//    println("The result is: ${addition(1, 2)}");
//    println("The result V2 is: ${additionV2(4, 7)}");

    printPersonDetails(dob = LocalDate.parse("2000-11-11"), email = "123123@gmail.com", name = "Anton");
    printPersonDetails("Antonio", dob = LocalDate.parse("2020-11-11"), email = "asdasd@cv.com");
    printPersonDetails("Antuan", email = "wow@wow.com");
    printPersonDetails("Antoha");
}
