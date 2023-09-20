package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Kullanici adinizi giriniz:")
    val kullaniciAdi = girdi.next()
    if (kullaniciAdi == "sefsat") {
        println("Giris Yapiliyor")
        Thread.sleep(5000)
        println("Basarili bir giris yaptiniz")
        Thread.sleep(2000)
        println("Hogeldiniz $kullaniciAdi")
    }else {
        println("Gecersiz kullanici adi")
        Thread.sleep(2000)
        println("Tekrar deneyiniz!")
    }


}