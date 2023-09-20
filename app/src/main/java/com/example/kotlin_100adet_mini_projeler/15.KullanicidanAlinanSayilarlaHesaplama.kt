package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Sayi giriniz:")
    val num1 = girdi.nextInt()
    for (i in 1..num1) {
        println(i)
    }



}