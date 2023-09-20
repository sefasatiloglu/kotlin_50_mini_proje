package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    //Klavyeden maasi ve zam orani girilen kisinin zamli maasini hesaplayan program

    val girdi = Scanner(System.`in`)
    println("Maas Giriniz:")
    val maas = girdi.nextDouble()
    println("Zam Orani(%) giriniz:")
    val zamOrani = girdi.nextDouble()
    val yeniMaas = maas+((maas*zamOrani)/100)
    println("Zamli Maasiniz: $yeniMaas")


}