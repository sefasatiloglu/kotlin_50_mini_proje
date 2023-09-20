package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden kisa kenar ve uzun kenar degerlerini girip dikdortgenin alanini ve cevresini hesaplayan program
    val girdi = Scanner(System.`in`)
    println("Kisa kenari giriniz:")
    val kisaKenar = girdi.nextInt()
    println("Uzun kenari giriniz:")
    val uzunKenar = girdi.nextInt()

    //Alan hesaplama
    val dAlan = (kisaKenar*uzunKenar)

    //Cevre Hesaplama
    val dCevre = 2*(kisaKenar+uzunKenar)
    println("""
        Dikdortgen Hesaplama
        ********************
        Kısa Kenar:$kisaKenar
        Uzun Kenar:$uzunKenar
        Dikdortgenin Alani: $dAlan
        Dikdortgenin Cevresi: $dCevre
        *********************
        
        
    """.trimIndent())





}