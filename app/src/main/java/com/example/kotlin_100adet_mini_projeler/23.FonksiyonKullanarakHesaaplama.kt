package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden girilen kisa kenar ve uzun kenar uzunlugu ile dikdörtgenin alanini fonksiyon kullanarak hesaplayan program

    //Fun ile fonskiyonu bu sekilde tanimliyoruz.
    fun alanHesapla(genislik:Int,yukseklik:Int) {

        val alan = genislik*yukseklik
        println("Alan: $alan")

    }


    val girdi = Scanner(System.`in`)
    println("Genisligi giriniz:")
    val genislik = girdi.nextInt()
    println("Yuksekligi giriniz:")
    val yukseklik = girdi.nextInt()

    alanHesapla(genislik,yukseklik)

}

