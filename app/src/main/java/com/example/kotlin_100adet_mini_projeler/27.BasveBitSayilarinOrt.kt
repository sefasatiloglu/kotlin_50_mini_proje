package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Baslangic Degerini Giriniz:")
    val basDeger = girdi.nextInt()
    println("Bitis Degerini Giriniz:")
    val bitDeger = girdi.nextInt()
    var toplam = 0
    var sayac = 0
    for (i in basDeger..bitDeger) {
        toplam+=i
        sayac++

    }
    println("Ortalama : ${toplam/sayac}")







}