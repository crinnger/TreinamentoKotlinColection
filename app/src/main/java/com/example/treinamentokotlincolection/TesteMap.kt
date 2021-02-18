package com.example.treinamentokotlincolection

fun main(){
    val pair1:Pair<String,Double> = Pair("Joao",1000.0)
    val pair2:Pair<String,Double> = Pair("Maria",2000.0)
    val pair3:Pair<String,Double> = Pair("Jose",3000.0)
    val map1= mapOf(pair1,pair2,pair3)

    map1.forEach{k,v ->
        println("Chave: $k - Valor:$v")
    }

    val map2= mapOf(
        "pedro" to 2500.0,
        "rogeria" to 300.0
    )
    map2.forEach{k,v ->
        println("Chave: $k - Valor:$v")
    }
}