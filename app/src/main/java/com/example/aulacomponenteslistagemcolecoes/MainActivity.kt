package com.example.aulacomponenteslistagemcolecoes

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aulacomponenteslistagemcolecoes.teste.Recursos

class MainActivity : AppCompatActivity() {

    private lateinit var btnExecutar: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExecutar = findViewById(R.id.btn_executar)
        textResultado = findViewById(R.id.text_resultado)

     /* btnExecutar.setOnClickListener {
          textResultado.text = "Ronaldo Xavier"
      }*/

    }

    fun cliqueBotao(view: View ){

        Toast.makeText(
            this,
            "Sucesso ao fazer algo",
            Toast.LENGTH_LONG
        ).show()

        textResultado.text = "Ronaldo Xavier"

    }

}