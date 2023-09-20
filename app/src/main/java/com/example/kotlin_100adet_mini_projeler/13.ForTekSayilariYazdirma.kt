package com.example.kotlin_100adet_mini_projeler

fun main() {

    //1 'den 20 ye kadar olan tek sayilari yazdirma
    println("Tek Sayilar")
    for (i in 1..20) {
        if ( !(i % 2 == 0)) { //! -> not anlaminda kullanilir(Degilse)
            println(i)
        }


    }


}