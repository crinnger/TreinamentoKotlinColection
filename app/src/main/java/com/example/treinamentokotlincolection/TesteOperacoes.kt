package com.example.treinamentokotlincolection

fun main(){
    val salarios = doubleArrayOf(1000.0,2000.0,5000.0,8000.0,500.0)

    println("maior salario:${salarios.max()}")
    println("menor salario:${salarios.min()}")
    println("media salario:${salarios.average()}")

    println("maior salario:${salarios.max()}")
    println("menor salario:${salarios.min()}")
    println("media salario:${salarios.average()}")
    var salarioFiltro = salarios.filter { it>2500.0 }

    salarioFiltro.forEach{println(it)}

    println(salarios.count{a -> a in 2000.0..5000.0})

    println(salarios.find{ it==5000.0 })
    
}