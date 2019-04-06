package br.com.possodirigir

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnContinua.setOnClickListener {
            if(edtNome.text.isNotEmpty()){
                val intenteTela2 = Intent(this, Tela2::class.java)



                intenteTela2.putExtra("NomeUsuario", edtNome.text.toString())
                startActivity(intenteTela2)
            }else{
                Toast.makeText(this, "Preencha o campo nome corretamente", Toast.LENGTH_LONG).show()
            }
        }
    }
}
