package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden girilen bir ifadeyi ekrana 10 defa yazdiran program

    val girdi = Scanner(System.`in`)
    println("Lutfen Metini Giriniz:")
    val girilenMetin = girdi.nextLine()

    for (i in 1..10 ) {
        println("$girilenMetin ")
    }

}