package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Yasinizi Giriniz:")
    val age = girdi.nextInt()
    println("$age yasindasiniz")
    if (age>= 18) {
        println("Tebrikler Ehliyet Alabilirsiniz.")
    }else {
        println("Ehliyet Alabilecek yaşta degilsiniz!")
    }

}