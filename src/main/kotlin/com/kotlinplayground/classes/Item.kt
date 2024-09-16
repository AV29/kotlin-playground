package org.example.com.kotlinplayground.classes

class Item() {
    var name: String = ""
        get() {
            println("Inside NAME getter");

            return field;
        }

    var price: Double = 0.0
        get() {
            println("Inside PRICE getter");

            return field;
        }
        set(value) {
            println("Inside PRICE setter");
            if(value >= 0) {
                field = value
            } else {
                throw IllegalArgumentException("Negative price is not allowed!")
            }
        }

    constructor(_name: String) : this() {
        name = "$_name!!!";
    }
}

fun main() {
    val stringItem = Item("QWERTY");

    println(stringItem.price)

    stringItem.price = 1.0;

    println(stringItem.price)

    stringItem.price = -0.4;
}