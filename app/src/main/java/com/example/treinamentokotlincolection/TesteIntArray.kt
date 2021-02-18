package com.example.treinamentokotlincolection

fun main(){

    val values = IntArray(5)

    values[0]=5
    values[1]=2
    values[2]=6
    values[3]=3
    values[4]=1

    for(valor in values){
        println(valor)
    }
    println("*******************************")
    values.forEach { a ->
        println(a)
    }

    println("*******************************")
    for(index in values.indices){
        println(values[index])
    }
    values.sort()
    println("*******************************")
    for(valor in values){
        println(valor)
    }
}