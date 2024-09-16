package org.example.com.kotlinplayground.basics

fun main() {

    label()

    for(i in 1..5){
        println("i in $i");

        if(i == 3) return;
    }
    println("END!")
}

fun label() {
   loop@ for(i in 1..5) {
       println("i in label $i");

       if(i == 3) break@loop;

       innerLoop@ for(j in 1..5) {
           println("j in label $j");
           if(j == 2) continue@loop
       }
   }
}
