package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

// Girilen metini alt alta yazdiran program

fun main() {

    val girdi = Scanner(System.`in`)
    println("Metni Giriniz")
    val metin = girdi.next()

    var sayac = 0
    while (sayac < metin.length) {

        println(metin[sayac])
        sayac++

    }




}