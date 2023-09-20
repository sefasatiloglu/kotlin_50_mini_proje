package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Girilen iki sayinin ortalamasini bulan uygulama yapalim.

    val girdi = Scanner(System.`in`)
    println("Birinci Sayiyi Giriniz:")
    val num1 = girdi.nextInt()
    println("İkinci Sayiyi Giriniz:")
    val num2 = girdi.nextInt()
    var ortalama = (num1+num2)/2
    println("Sayilarin Ortalamasi: $ortalama")


}