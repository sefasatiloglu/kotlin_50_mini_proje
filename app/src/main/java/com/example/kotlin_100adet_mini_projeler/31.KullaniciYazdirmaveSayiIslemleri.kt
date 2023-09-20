package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden girilen bir ifadeti klavyeden girilen bir sayi kadar ekrana yazdiran program

    val girdi = Scanner(System.`in`)
    println("Metin Giriniz:")
    val metinAlma = girdi.nextLine()
    println("Kaç defa yazdirilsin:")
    val kacDefa = girdi.nextInt()

    for (i in 1..kacDefa) {
        println(metinAlma)
    }






}