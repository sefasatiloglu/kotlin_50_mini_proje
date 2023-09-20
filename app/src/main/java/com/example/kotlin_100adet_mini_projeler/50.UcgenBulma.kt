package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Birinci Aciyi Giriniz:")
    val num1 = girdi.nextInt()
    println("Ikinci Aciyi Giriniz:")
    val num2 = girdi.nextInt()
    println("Ucuncu Aciyi Giriniz:")
    val num3 = girdi.nextInt()
    var toplam = (num1+num2+num3)
    if (toplam == 180) {
        println("Bu girdiginiz acilar ucgen olusturur.")
    }else {
        println("Bu girdiginiz acilar ucgen olusturmaz!")
    }



}