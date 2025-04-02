package com.example.aulacomponenteslistagemcolecoes

import com.example.aulacomponenteslistagemcolecoes.teste.Pessoa

/*
class Motorista( val nome: String ) {
    fun exibirDadosMotorista() = println("Motorista: $nome")

    inner class Caminhao( val nomeCaminhao: String ){//Classe aninhada  (Nested Class)
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao motorista: $nome")
    }
}
*/

/*data class Pergunta( val pergunta: String, val respostaCerta: Int )*/

//Getter (conseguir, recuperar) e setter (configurar)
/*class Usuario(){

    var nome: String = ""
        get() {
            return field.uppercase()//Campo
        }
        set(value) {
            field = "set: $value"

        }
    var idade: Int = 0
    val maiorIdade
        get() = idade >= 18



}*/

class Usuario {
    fun salvarTelefones( vararg telefones: String ){
        for ( telefone in telefones){
            println("telefone: $telefone")

        }

    }
}

fun main() {

    val usuario = Usuario()
    usuario.salvarTelefones(
        "(61) 99300-4754",
        "(61) 99300-4754",
        "(61) 99300-4754",
        "(61) 99300-4754",
        "(61) 99300-4754",
        "(61) 99300-4754",
    )

   /* val pessoa = Pessoa()
    pessoa.salvarTelefone(
        "(61) 99300-3991",
        "(61) 99300-4754",
        "(61) 99300-4754",
        "(61) 99300-4754",
        "(61) 99300-4754",
        "(61) 99300-4754",
        "(61) 99300-4754",
        "(61) 99300-4754",
    )
*/


/*

    val usuario = Usuario()
    usuario.nome = "Pedro"
    usuario.idade = 15

    println( "nome: ${usuario.nome} idade: ${usuario.idade} maiorIdade: ${usuario.maiorIdade}" )

*/

   /* val pessoa = Pessoa()
    pessoa.nome = "Ronaldo"

    println("nome: ${pessoa.nome}")
*/
    /*val pergunta1 = Pergunta("Qual a pergunta?", 1 )
    val pergunta2 = Pergunta("Qual a pergunta?", 2 )

    val (pergunta, resposta ) = pergunta1

    println(pergunta)
    println(resposta)
*/
    /*println( pergunta1 )//Pergunta@45c8e616
    println( pergunta2 )//Pergunta@4cdbe50f*/
    //println( pergunta1 == pergunta2 )

        /*val motorista = Motorista("Ronaldo")
    val caminhao = motorista.Caminhao("FH 600")
    caminhao.exibirDadosCaminhao()
*/
    //val motorista = Motorista("Ronaldo")
    /*val caminhao = Motorista.Caminhao("FH 600")
    caminhao.exibirDadosCaminhao()
*/

    /*val motorista = Motorista("Ronaldo")
    motorista.exibirDadosMotorista()*/

}