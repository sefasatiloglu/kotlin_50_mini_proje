package com.example.kotlin_100adet_mini_projeler

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Lutfen yasinizi Giriniz:")
    val yasDegeri = girdi.nextInt()

    if (yasDegeri<18) {
        println("Cocuksunuz")
    }
    else if(yasDegeri>=18 && yasDegeri<40) {
        println("Gencsiniz")
    }
    else if (yasDegeri>=40 && yasDegeri<=60) {
        println("Orta Yaslisiniz")
    }
    else {
        println("Yaslisiniz!")
    }


}