package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Girilen kullanici ismine göre ekrana "Hello Kullanici" yazdıralım

    val girdi = Scanner(System.`in`)
    println("Lütfen isminizi giriniz:")
    val userName = girdi.next()
    println("Hello $userName")


}