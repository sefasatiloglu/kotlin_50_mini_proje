package com.example.kotlin_100adet_mini_projeler

fun main() {

    // 1 den 10 kadar olan sayilari alt alta yazdirma
    // Normal sekilde for 1..10 arasinda yazinca son elemani dahil ediyor.
    for (i in 1..10) {
        println(i)
    }
    // Eger Until kullanirsak son elemani dahil etmiyor.
    println("**************** Until Farki ***********************")
    for (i in 1 until 10) {
        println(i)
    }



}