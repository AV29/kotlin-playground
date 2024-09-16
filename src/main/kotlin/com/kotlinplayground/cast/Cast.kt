package org.example.com.kotlinplayground.cast

import org.example.com.kotlinplayground.classes.Course

fun main() {
    val course = Course(2, "Reactive Programming", "Anton V")

    checkType(course);
    checkType("Anton");

    castNumber(1.0)
    castNumber(1)
}

fun castNumber(any: Any) {
    when(any) {
        any as? Double -> { println("Double any = $any") }
        any as? Int -> { println("Int any = $any") }
    }


}

fun checkType(type: Any) {
    when(type) {
        is Course -> {
            println(type.name);
        }

        is String -> {
            println(type.lowercase());
        }
    }

}
