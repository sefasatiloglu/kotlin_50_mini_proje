package com.example.kotlin_100adet_mini_projeler

fun main() {

    //1 den 100 kadar olan sayilardaan aynı anda 3 ve 5 tam bölümen sayilari yazdirma
    println("3 ve 5 bolunen sayilar")
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println(i)
        }
    }


}