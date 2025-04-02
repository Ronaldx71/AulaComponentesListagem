package com.example.aulacomponenteslistagemcolecoes.teste

fun main() {

    val listaLanches = listOf("Hamburguer", "Batata frita")
    val listaEntradas = listOf("Coxa de frango", "Pipoca")


    //val novaLista = listaLanches.union( listaEntradas )
    val listaExclusao = listOf("Pipoca", "Batata frita")
    val novaLista = listaEntradas + listaLanches
    val listaCompleta = novaLista - listaExclusao
    println( listaCompleta )

}