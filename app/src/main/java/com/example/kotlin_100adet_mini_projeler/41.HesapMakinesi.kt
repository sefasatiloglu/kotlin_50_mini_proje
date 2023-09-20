package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Birinci Sayiyi giriniz:")
    val num1 = girdi.nextDouble()
    println("ikinci Sayiyi giriniz:")
    val num2 = girdi.nextDouble()
    println("Hangi islemi istiyorsaniz seciniz: (+,-,*,/)")
    val secim = girdi.next()
    if (secim == "+") {
        println("Toplama islemini sectiniz.")
        Thread.sleep(5000)
        println("iste sonucunuz:")
        Thread.sleep(2000)
        println("$num1 + $num2 = ${num1+num2}")
    }
    if (secim == "-") {
        println("Cikarma islemini sectiniz.")
        Thread.sleep(5000)
        println("iste sonucunuz:")
        Thread.sleep(2000)
        println("$num1 - $num2 = ${num1-num2}")
    }
    if (secim == "*") {
        println("Carpma islemini sectiniz.")
        Thread.sleep(5000)
        println("iste sonucunuz:")
        Thread.sleep(2000)
        println("$num1 X $num2 = ${num1*num2}")
    }
    if (secim == "/") {
        println("Bolme islemini sectiniz.")
        Thread.sleep(5000)
        println("iste sonucunuz:")
        Thread.sleep(2000)
        println("$num1 / $num2 = ${num1/num2}")
    }



}