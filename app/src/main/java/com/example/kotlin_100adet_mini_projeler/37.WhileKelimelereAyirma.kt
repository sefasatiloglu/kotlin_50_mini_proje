package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

//Klavyeden girilen bir metni harflarine ayıran kotlin programını while döngüsü ile yazdıran kodunu yazınız.
fun main() {
    val girdi = Scanner(System.`in`)
    print("Metin Giriniz:")
    val metinAlma = girdi.nextLine()
    var sayac = 0
    while (sayac <metinAlma.length) {

        println(metinAlma[sayac])
        sayac++

    }



}

