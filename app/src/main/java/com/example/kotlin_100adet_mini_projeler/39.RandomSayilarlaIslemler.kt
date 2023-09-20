package com.example.kotlin_100adet_mini_projeler

import kotlin.random.Random

fun main() {

   val random = List(10) {Random.nextInt(0,101)}
    println("Uretilen Rastgele Sayilar: $random")

    val maxNumber = random.maxOrNull()
    val minNumber = random.minOrNull()

    println("En buyuk sayi: $maxNumber")
    println("En kucuk sayi: $minNumber")



}