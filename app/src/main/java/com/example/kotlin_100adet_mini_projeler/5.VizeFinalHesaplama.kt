package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Vize ve Final notlarini hesaplama uygulamasi

    val girdi = Scanner(System.`in`)
    println("Lütfen vize notunu giriniz:")
    val vize = girdi.nextInt()
    println("Lütfen final notunuzu giriniz:")
    val final = girdi.nextInt()
    // Vizenin %40 ve finalin %60 aliyoruz.

    val hesapla = (vize * 0.4) + (final*0.6)
    println("Ders Notunuz: $hesapla")

}