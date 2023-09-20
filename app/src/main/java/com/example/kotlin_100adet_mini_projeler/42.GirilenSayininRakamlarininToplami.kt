package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Sayi giriniz:")
    val sayiAlma = girdi.next()
    var toplam = 0
    for (i in sayiAlma) {

        toplam = toplam + i.toString().toInt()
    }
    println("Rakamlar Toplami: $toplam")


}