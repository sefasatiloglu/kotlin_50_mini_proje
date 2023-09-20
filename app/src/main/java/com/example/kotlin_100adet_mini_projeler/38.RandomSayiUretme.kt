package com.example.kotlin_100adet_mini_projeler

import kotlin.random.Random

fun main() {
    // Kotlin ile random sayi uretme
    val count = 5

    for (r in 1..count) {
        val random = Random.nextInt(1,100)
        println(random)
    }


}