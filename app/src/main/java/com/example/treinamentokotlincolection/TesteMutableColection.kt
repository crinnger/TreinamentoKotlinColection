package com.example.treinamentokotlincolection

fun main(){
    val joao = Funcionario("Joao",2000.0,"a")
    val jose = Funcionario("Jose",3000.0, "b")
    val maria = Funcionario("Maria",1000.0, "a")
    val pedro = Funcionario("Pedro",500.0, "a")

    val funcionarios = mutableListOf(joao,jose,maria)

    funcionarios.forEach{println(it)}

    println("*******************************")
    funcionarios.add(pedro)
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("*******************************")
    funcionarios.remove(maria)
    funcionarios.forEach{println(it)}

    println("*********SET*******************")
    val funSet = mutableSetOf(joao,jose)
    funSet.add(pedro)
    funSet.add(pedro)
    funSet.forEach{println(it)}

}