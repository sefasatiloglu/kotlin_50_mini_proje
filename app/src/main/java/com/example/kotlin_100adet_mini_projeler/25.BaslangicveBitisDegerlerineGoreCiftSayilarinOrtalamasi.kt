package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden girilen baslangic ve bitis sayilari arasinda bulunan cift sayilarin ortalamasini bulan program

    val girdi = Scanner(System.`in`)
    println("Baslangic Degerini Giriniz")
    val baslangicDeger = girdi.nextInt()
    println("Bitis Degerini giriniz")
    val bitisDeger = girdi.nextInt()
    var toplam = 0
    var sayac = 0
    for (i in baslangicDeger..bitisDeger) {
        if (i % 2 == 0) {
            toplam+=i
            sayac++
        }
    }
    println("Cift Sayilarin Ortalamasi: ${toplam/sayac}")



}