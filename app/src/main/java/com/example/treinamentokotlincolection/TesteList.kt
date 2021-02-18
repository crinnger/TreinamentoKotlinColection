package com.example.treinamentokotlincolection


fun main(){
    val joao = Funcionario("Joao",2000.0,"a")
    val jose = Funcionario("Jose",3000.0, "b")
    val maria = Funcionario("Maria",1000.0, "a")

    val funcionarios = listOf(joao,jose,maria)

    funcionarios.forEach { println(it) }

    println(funcionarios.find { it.nome=="Maria" })

    funcionarios.sortedBy { it.salario }
                .forEach { println(it) }

    funcionarios.groupBy { it.setor }
        .forEach { println(it) }


}

