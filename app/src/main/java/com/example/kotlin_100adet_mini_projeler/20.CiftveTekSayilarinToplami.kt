package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden girilen sayiya kadar olan sayilardan tek sayilarin toplami ve cift sayilarin toplamini bulan program
    val girdi = Scanner(System.`in`)
    var ciftSayi = 0
    var tekSayi = 0
    println("Sayi Giriniz:")
    val n1 = girdi.nextInt()
    for (i in 1..n1) { // Girilen deger dahildir! (Dahil etmek istemiyorsaniz 'until' kullanabilirsiniz.
        if (i % 2 == 0) {
            println("Cift sayi: $i")
            ciftSayi+=i
        }else {
            println("Tek Sayi: $i")
            tekSayi+=i
        }
    }
    println("Tek sayilarin toplami : $tekSayi")
    println("Cift Sayilarin Toplami: $ciftSayi")



}