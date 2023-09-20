package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    // Klavyeden girilen sayıya kadar olan cift sayıların toplamını hesaplayan ve sonucu yazdıran kotlin kodunu while döngüsü kullanarak yapan program

    val girdi = Scanner(System.`in`)
    println("Sayi giriniz:")
    val sayi = girdi.nextInt()
    var sayac = 0
    var toplam = 0
    while (sayac<=sayi) {

        sayac+=2
        toplam+=sayac

    }
    println("Cift Sayilarin Toplami: $toplam")



}