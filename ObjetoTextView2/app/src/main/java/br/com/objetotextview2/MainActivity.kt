package br.com.objetotextview2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // oncreate: Metodo dispara quando a janela é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txvTexto1.text = "Trabalhando com textos"
        txvTexto1.visibility = false
        if(btn1.isActivated){

        }
    }

}
