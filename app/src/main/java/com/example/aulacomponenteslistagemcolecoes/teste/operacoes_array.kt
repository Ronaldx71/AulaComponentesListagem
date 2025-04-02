package com.example.aulacomponenteslistagemcolecoes.teste

fun main() {

    val lista = arrayOf("Ronaldo", "Maria", "Pedro", "Ana")
    //println( lista[0] )
    //println( lista.size )
    //println( lista.indexOf("ronaldo") )
    //println( lista.first(  ) )
    //println( lista.last(  ) )
    //println( lista.contains("joão") )


    //val novaLista = lista.plus( "joão" )
    lista.shuffle()
    lista.forEach { item ->
        println( item )
    }

}