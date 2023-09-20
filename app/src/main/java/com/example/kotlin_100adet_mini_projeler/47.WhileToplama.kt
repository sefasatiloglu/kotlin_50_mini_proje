package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden 0 rakamı girilene kadar girilen tüm sayıların kaç tane olduğunu ve bu sayıların toplamını bulan ve ekranda gösteren kotlin kodu

    val girdi = Scanner(System.`in`)
    var sayac = 0
    var toplam = 0
    println("Sayi giriniz: (Cikis icin 0 tusla)")
    while (true) {
        println("Sayi giriniz:")
        val girilenSayi = girdi.nextInt()
        if (girilenSayi == 0)
            break
        toplam+=girilenSayi
        sayac++

    }
    println("Girilen toplam sayi adedi: $sayac")
    println("Girilen sayilarin toplami: $toplam")




}