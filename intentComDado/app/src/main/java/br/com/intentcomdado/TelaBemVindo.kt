package br.com.intentcomdado

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela_bem_vindo3.*

class TelaBemVindo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_bem_vindo3)

        //Capturanndo o dado enviado pelo Intent
        val nomeCapturado = intent.getStringExtra("DadoNome")

        //Atribuindo dado resgatado ao text view

        txvNome.text = nomeCapturado
        btnBack.setOnClickListener {
            finish()
        }
    }
}
