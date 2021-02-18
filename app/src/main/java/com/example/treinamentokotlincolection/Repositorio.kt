package com.example.treinamentokotlincolection

class Repositorio<T> {
    private val map = mutableMapOf<String,T>()

    fun create (id:String, value:T){
        map[id]=value
    }

    fun findByID(id:String) = map[id]

    fun findall() = map.values

    fun remove(id:String) = map.remove(id)
}