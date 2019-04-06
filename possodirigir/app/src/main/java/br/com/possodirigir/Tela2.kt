package br.com.possodirigir

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        //Resgatando o nome de usurioa na man

        val nomeResgate = intent.getStringExtra("NomeUsuario")

        // colocandio o nome regatado
        txvNome.text = nomeResgate
        val  arrayIdades = arrayListOf<Int>()
                for (umaIdade in 0..100){
                    arrayIdades.add(umaIdade)
                }
        val arrayAdaptado = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arrayIdades)
        spnIdade.adapter = arrayAdaptado
    }
}
