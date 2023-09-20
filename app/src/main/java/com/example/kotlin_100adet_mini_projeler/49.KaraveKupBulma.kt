package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Sayi giriniz:")
    val sayi = girdi.nextInt()
    println("Girilen sayinin karesi ${sayi*sayi}")
    println("Girilen sayinin kupu ${sayi*sayi*sayi}")


}