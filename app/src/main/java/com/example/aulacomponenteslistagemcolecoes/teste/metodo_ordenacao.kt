package com.example.aulacomponenteslistagemcolecoes.teste

fun main() {

    val listaNomes = listOf("jamilton", "ana", "bruno", "maria", "zeus")
    val listaNumeros = listOf(2, 1, 3)


    //val novaListaNumeros = listaNumeros.sorted()//ASC ascendente a-z0..8
    //val novaListaNumeros = listaNumeros.sortedDescending()//DESC descendente z-a8..0

    val novaListaNomesAsc = listaNomes.sorted()
    val novaListaNomesDesc = listaNomes.sortedDescending()

    println( novaListaNomesAsc )
    println( novaListaNomesDesc )

}