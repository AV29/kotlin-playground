package org.example.com.kotlinplayground.classes

class Person (private val name: String = "", private val age: Int = 0) {
    private var email: String = "";
    private var address: String = "";
    init {
        this.address = "ul. Sikorskiego";
        println("INIT!!!");
    }

    constructor(email: String, name: String = "", age: Int = 0) : this(age = age, name = name) {
        println("CTOR!!!");
        this.email = email
    }

    fun action() {
        println("Person!: $name is of age $age. He's email is: $email. He lives on $address")
    }
}

fun main(args: Array<String>) {
    val person = Person(email = "anton@ccc.com", name = "Anton", age = 1);

    person.action();
}