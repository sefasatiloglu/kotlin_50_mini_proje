package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Bir dersin ortalamasi girilen ogrencinin o dersten gecip gecmedigini kontol eden uygulama yazalim.

    val girdi = Scanner(System.`in`)
    println("Lutfen ders ortalamanizi giriniz:")
    val ort = girdi.nextFloat()

    if (ort>=50) {
        println("Dersi Gectiniz.")
    }else {
        println("Dersten Kaldiniz!")
    }


}