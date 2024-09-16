package org.example.com.kotlinplayground.classes

object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("Authenticating user with username: $userName")
    }
}

fun main(args: Array<String>) {
    Authenticate.authenticate(userName = "Anton", password = "123")
}