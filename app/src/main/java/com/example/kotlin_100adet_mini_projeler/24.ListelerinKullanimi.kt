package com.example.kotlin_100adet_mini_projeler

fun main() {

    //Sayilar listesinden kac tanesi 5'in kati oldugunu bulan program

    val sayilar = arrayListOf(101,103,19,95,12,40,55,5,15,22,32,99,23,155,210,43,27,12,9,50)
    for (sayi in sayilar) {
        if (sayi % 5 == 0) {
            println("$sayi sayisi 5'in kati")
        }
    }


}