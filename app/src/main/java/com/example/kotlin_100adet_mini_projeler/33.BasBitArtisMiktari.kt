package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden başlangıç değeri, bitiş değeri ve artış miktarı girilen sayıları alt alta yazdıran program

    val girdi = Scanner(System.`in`)
    println("Baslangic Degerini Giriniz:")
    val basDeger = girdi.nextInt()
    println("Bitis Degerini Giriniz:")
    val bitDeger = girdi.nextInt()
    println("Artis Miktarini Giriniz:")
    val artisMiktari = girdi.nextInt()

    for (i in basDeger..bitDeger step artisMiktari) {
        println(i)
    }



}