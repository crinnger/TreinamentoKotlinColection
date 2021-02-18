package com.example.treinamentokotlincolection

fun main(){
    val joao = Funcionario("Joao",2000.0,"a")
    val jose = Funcionario("Jose",3000.0, "b")
    val maria = Funcionario("Maria",1000.0, "a")

    val funcionarios1 = setOf(joao,jose)
    val funcionarios2 = setOf(maria,jose)
    val funcionarios = funcionarios1.union(funcionarios2)

    funcionarios.forEach { println(it) }
    println("*******************************")
    println(funcionarios.find { it.nome=="Maria" })
    println("*******************************")
    funcionarios.sortedBy { it.salario }
        .forEach { println(it) }
    println("*******************************")
    funcionarios.groupBy { it.setor }
        .forEach { println(it) }

    println("*******************************")
    val funcionarios3 = funcionarios.subtract(funcionarios1)
    funcionarios3.forEach { println(it) }

    println("*******************************")
    val funcionarios4 = funcionarios.intersect(funcionarios1)
    funcionarios4.forEach { println(it) }
}
