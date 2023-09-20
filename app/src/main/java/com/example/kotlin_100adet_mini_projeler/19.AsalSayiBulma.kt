package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden girilen sayinin asal olup olmadigini bulan program

    val girdi = Scanner(System.`in`)
    println("Sayi giriniz:")
    val num1 = girdi.nextInt()
    var sayac = 0
    for (i in 2..num1) {
        if (num1 % i == 0) {
            sayac++
            println(sayac)
            println(i)
            break
        }

    if (sayac!=0) {
         println("Girilen Sayi Asal Degil!")
     }else{
         println("Girilen Sayi Asal")
     }
    }



}