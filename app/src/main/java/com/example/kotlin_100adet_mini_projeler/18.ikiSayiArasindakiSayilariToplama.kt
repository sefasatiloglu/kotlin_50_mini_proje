package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Girilen iki sayiyinin arasindaki sayilari toplama

    val girdi = Scanner(System.`in`)
    println("Birinci Sayiyi Giriniz:")
    val num1 = girdi.nextInt()
    println("Ikinci Sayiyi Giriniz:")
    val num2 = girdi.nextInt()
    var toplam = 0
    for (i in num1+1 until num2){
        println(i)
        toplam+=i
    }
    println("$num1 ile $num2 arasindaki sayilarin toplami :$toplam")



}