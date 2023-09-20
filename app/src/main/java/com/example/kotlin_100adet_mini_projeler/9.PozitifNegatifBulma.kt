package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    // Klavyeden girilen sayinin pozitif mi negatif mi yoksa sifir mi oldugunu bulan program

    val girdi = Scanner(System.`in`)
    println("Lutfen Sayi Girimiz:")
    val num1 = girdi.nextInt()
    if (num1 > 0) {
        println("$num1 sayisi pozitiftir.")
    }
    else if (num1 < 0 ) {
        println("$num1 sayisi negatiftir.")
    }else {
        println("Girdiginiz sayi 0'dir.")
    }



}