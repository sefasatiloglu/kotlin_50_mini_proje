package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden girilen baslangic ve bitis sayilari arasinda bulunan tek sayilarin ortalamasini bulan program

    val girdi = Scanner(System.`in`)
    println("Baslangic Degeri Giriniz:")
    val baslangicDegeri = girdi.nextInt()
    println("Bitis Degeri Giriniz:")
    val bitisDegeri = girdi.nextInt()
    var toplam = 0
    var sayac = 0
    for (i in baslangicDegeri..bitisDegeri) {
        if (!(i % 2 == 0)) {
            toplam+=i
            sayac+=1
        }

    }
    println("Tek Sayilarin Ortalamasi: ${toplam/sayac}")





}