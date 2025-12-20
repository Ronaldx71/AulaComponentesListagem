package com.example.aulacomponenteslistagemcolecoes

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MensagemAdapter(
    private val lista: List<Mensagem>
) : RecyclerView.Adapter<MensagemAdapter.MensagemViewHolder>() {

    inner class MensagemViewHolder(
        val itemView: android.view.View
    ) : RecyclerView.ViewHolder( itemView ) {

        val textNome: TextView = itemView.findViewById(R.id.text_nome)
        val textUltima: TextView = itemView.findViewById(R.id.text_ultima)
        val textHrorario: TextView = itemView.findViewById(R.id.text_horario)

    }

    //Ao criar o view holder -> criar a visualição
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MensagemViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )

        val itemView = layoutInflater.inflate(
            R.layout.item_lista, parent, false

        )

        return MensagemViewHolder( itemView )

    }

    // ao vincular os dados para o visualização
    override fun onBindViewHolder(
        mensagemViewHolder: MensagemViewHolder,
        position: Int
    ) {

        val mensagem = lista[position]
        mensagemViewHolder.textNome.text = mensagem.nome
        mensagemViewHolder.textUltima.text = mensagem.ultima
        mensagemViewHolder.textHrorario.text = mensagem.horaio

    }

    //getItemCount -> Recuperar a quantidade de itens
    override fun getItemCount(): Int {
        return lista.size
    }



}