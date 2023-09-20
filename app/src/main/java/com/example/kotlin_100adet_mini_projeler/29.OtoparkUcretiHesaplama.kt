package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    // 1 saat : 5 Tl
    // 1-5 saat arasi : Saat Basi 4 Tl
    // 5 saatten fazla : Saat Basi 3 Tl

    val girdi = Scanner(System.`in`)
    println("Kaldiğiniz süreyi giriniz:")
    val parkHesapla = girdi.nextInt()

    var ucret = 0

    if (parkHesapla <=1) {
        ucret = 5
    }
    else if (parkHesapla <=5) {
        ucret = 4 * parkHesapla

    }else {
        ucret = 3* parkHesapla
    }
    println("Odemeniz Gereken Park Ucreti : $ucret TL'dir-")







}