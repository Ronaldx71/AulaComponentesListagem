package com.example.aulacomponenteslistagemcolecoes.teste

data class Cliente(
    val nome: String,
    val idade: Int
)

fun main() {

    //val cliente1 = Cliente("Jamilton", 35)
    //val cliente2 = Cliente("ana", 22)

    val lista = mutableListOf("Ronaldo", "ana", "maria", "pedro")
    /*val listaClientes = mutableListOf(
        Cliente("Jamilton", 35),
        Cliente("ana", 22)
    )*/

   /* listaArray[0] = "Ronaldo Alterado"

    val novaLista = listOf("marcelo", "marcela")
    listaArray.addAll( novaLista )
    listaArray.add( "marcia" )
    //listaArray.remove("ana")
    listaArray.removeAt(1)*/


    //listaClientes.clear()
    //listaClientes.size
   //println( lista[1] )
    val novaLista = lista.shuffled()
    novaLista.forEach { nome ->
        println( nome )
        //println("${cliente.nome} - ${cliente.idade}")
    }

}