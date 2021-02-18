package com.example.treinamentokotlincolection

fun main(){
    val salarios= DoubleArray(3)
    salarios[0]=1000.0
    salarios[1]=2000.0
    salarios[2]=300.0

    salarios.forEach { a -> println(a) }

    println("*******************************")
    salarios.forEachIndexed { index, sal ->
        salarios[index]=sal * 1.1
    }

    println("*******************************")
    salarios.forEach { a -> println(a) }


}