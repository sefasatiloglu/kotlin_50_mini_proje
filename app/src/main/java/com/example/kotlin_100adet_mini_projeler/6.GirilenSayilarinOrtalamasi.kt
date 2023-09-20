package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden girilen uc yazili notunun ortalamasini hesaplayan program

    val girdi = Scanner(System.`in`)
    println("1.Yazili Notunuzu Giriniz:")
    val n1 = girdi.nextInt()
    println("2.Yazili Notunuzu Giriniz:")
    val n2 = girdi.nextInt()
    println("3.Yazili Notunuzu Giriniz:")
    val n3 = girdi.nextInt()
    val ort = (n1+n2+n3) / 3
    println("Yazili Ortalamasi : $ort")


}