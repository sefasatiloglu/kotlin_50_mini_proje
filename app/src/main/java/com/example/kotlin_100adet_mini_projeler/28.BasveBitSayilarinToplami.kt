package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden girilen baslangic ve bitis sayilari arasinda bulunan sayilarin toplamı

    val girdi = Scanner(System.`in`)
    println("Baslangic Degeri Giriniz:")
    val basDeger = girdi.nextInt()
    println("Bitis Degeri Giriniz:")
    val bitDeger = girdi.nextInt()
    var toplam = 0
    for (i in basDeger..bitDeger) {

        toplam+=i

    }
    println("Sayilarin Toplami : $toplam")

}