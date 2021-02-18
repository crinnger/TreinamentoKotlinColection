package com.example.treinamentokotlincolection

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "4000".toBigDecimal(),
        "3000".toBigDecimal()
    )

    println(salarios.somatoria())
    println(salarios.media())

}