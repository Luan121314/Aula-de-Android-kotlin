package br.com.intentcomdado

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela_bem_vindo3.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Clicando no botão entrar
        btnEntrar.setOnClickListener {
            //Verificando se o campo se o campo esta preechido
            if(edtNome.text.isNotEmpty()){
                //Capturando o texto digitado
                val nomeCapturado = edtNome.text.toString()

                //Criando Intent para tela BemVindo
                val intentTelaBemVindo = Intent(this, TelaBemVindo::class.java)

                // Imbutindo o dado dentro do Intent
                intentTelaBemVindo.putExtra("DadoNome", nomeCapturado)

                //ERxecutar o intent
                startActivity(intentTelaBemVindo)


            }else{
                //Mostrando um alerta simples (Toast)
                val alertToast = Toast.makeText(this, "Preencha o campo corretamente.",Toast.LENGTH_LONG)
                //exibir o alerta
                alertToast.show()
            }
        }
    }
}
