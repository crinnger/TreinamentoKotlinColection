package com.example.treinamentokotlincolection

fun main() {

    val joao = Funcionario("Joao", 2000.0, "a")
    val jose = Funcionario("Jose", 3000.0, "b")
    val maria = Funcionario("Maria", 1000.0, "a")
    val pedro = Funcionario("Pedro", 500.0, "a")

    val repositorio=Repositorio<Funcionario>()

    repositorio.create(joao.nome,joao)
    repositorio.create(jose.nome,jose)
    repositorio.create(maria.nome,maria)

    repositorio.findall().forEach { println(it) }

}
