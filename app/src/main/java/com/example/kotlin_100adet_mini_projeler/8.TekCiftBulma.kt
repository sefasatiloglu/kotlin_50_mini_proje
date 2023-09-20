package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden girilen sayinin tek mi cift mi kontrolunu yapan bir uygulama

    val girdi = Scanner(System.`in`)
    println("Lutfen Sayinizi Giriniz:")
    val num1 = girdi.nextInt()

    if (num1 % 2 == 0 ) {
        println("Girilen Sayi Cift")
    }else {
        println("Girilen Sayi Tek")
    }


}