package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Kenar giriniz:")
    val kenarS = girdi.nextInt()
    val cevre = kenarS*4
    val alan = (kenarS * kenarS)
    println("Karenin Cevresi : $cevre")
    println("Karenin Alani :   $alan")




}