package com.example.aulacomponenteslistagemcolecoes.teste

/*
data class Produto(
    val nome: String
)
*/

fun main() {


    // 0 -> "jamiltom" 1 -> "ana"
    //val listaItens = listOf("jamilton", "ana")
    //val lista = mapOf("102545" to "notebook", "105632" to "Iphone")
    val lista = mutableMapOf("nome" to "jamilton", "cidade" to "são paulo" )
    println( lista["nome"] )
    println( lista.size )
    //lista.put("idade", 20)
    lista["idade"] = "20"
    lista.remove( "nome" )
    lista.forEach { produto ->
        println( " ${produto.key}  - ${produto.value} " )
    }


}