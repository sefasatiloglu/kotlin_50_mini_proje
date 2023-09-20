package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Sayi giriniz:")
    val sayi = girdi.nextInt()
    var faktoriyel = 1
    for (i in 1 .. sayi) {
        faktoriyel*=i

    }
    println("$sayi! = $faktoriyel")



}