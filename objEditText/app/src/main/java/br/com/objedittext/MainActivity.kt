package br.com.objedittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Método disparado quando btnEntrar for tocado
        btnEntrar.setOnClickListener {
            //Verificando se os campos estão preechidos
            if(campoUsuario.text.isNotEmpty() && campoSenha.text.isNotEmpty()){
                //Verificando se usuario e senha estão corretos
                val nomeUsuario = campoUsuario.text.toString()
                val senha = campoSenha.text.toString()
                if(nomeUsuario == "admin" && senha == "1234"){
                    txvRes.text = "Bem vindo $nomeUsuario"

                }else{
                    txvRes.text = "Usuario ou senha incorretos"
                }
            }else{
                txvRes.text = "Preencha os campos"
            }
        }
    }
}
