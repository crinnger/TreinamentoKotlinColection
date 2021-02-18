package com.example.treinamentokotlincolection

fun main(){
    var teste = Array<String>(3){""}

    teste[0] ="crinnger"
    teste[1] ="fagundes"
    teste[2] ="oliveira"

    for(a in teste){
        println(a)
    }


    println("*******************************")
    teste.forEach { a ->
            println(a)
    }

}