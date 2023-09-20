package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden girilen yaricap ile dairenin cevresini ve alanini hesaplayan program

    val girdi = Scanner(System.`in`)
    println("Yari Cap Giriniz:")
    val yariCap = girdi.nextDouble()
    val cevre = (2*3.14*yariCap) // 2*Pi*Yaricap
    val alan = 3.14*(yariCap*yariCap) // Pi*(yaricap*yaricap)
    println("Dairenin Cevresi: $cevre")
    println("Dairenin Alani: $alan")


}