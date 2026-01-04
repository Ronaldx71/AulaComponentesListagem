package com.example.aulacomponenteslistagemcolecoes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class RecycleViewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)

        val lista = listOf(
            Mensagem("Ronaldo", "Olá, tudo bem?", "10:45"),
            Mensagem("Ana", "Lorem ipsun dolorem sit amet, dolor sit amet ipsum dolorem, dolor sit amet ipsum dolorem, Lorem ipsun dolorem sit amet, dolor sit amet ipsum dolorem, dolor sit amet ipsum dolorem", "00:45"),
            Mensagem("Maria", "Não acredito", "6:03"),
            Mensagem("Pedro", "Futebol hoje?", "15:33"),

        )

        rvLista = findViewById(R.id.rv_lista)
        rvLista.adapter = MensagemAdapter(lista) //tipo: MensagemAdapter, Adapter


        //LinearLayoutManeger  (XML e Código)
       /* rvLista.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false

        )*/

       /* rvLista.layoutManager = GridLayoutManager(
            this,
            2

        )*/
        rvLista.layoutManager = StaggeredGridLayoutManager(
            2,
            RecyclerView.VERTICAL

        )


    }
}