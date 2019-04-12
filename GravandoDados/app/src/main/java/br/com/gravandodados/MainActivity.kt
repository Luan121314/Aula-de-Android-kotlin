package br.com.gravandodados

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    //Propriedade de classe
    var acessoSharedPref : SharedPreferences? = null
    var editorSharedPref : SharedPreferences.Editor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Atribuido valores aos obj do SharedPref

        acessoSharedPref = getSharedPreferences("meusDados", Context.MODE_PRIVATE)
        editorSharedPref = acessoSharedPref!!.edit()  //!! garanti que terá algo (forced)

        // Gravando dados
        btnGravar.setOnClickListener {
            //vericando se o campo esta preechido
            if (edtDado.text.isNotEmpty()){
                val textoDigitado = edtDado.text.toString()

                //gravando texto
                editorSharedPref!!.putString("dado",textoDigitado)
                editorSharedPref!!.apply()

                edtDado.text.clear()

                Toast.makeText(this, "Dado gravado com sucesso", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Preencha o campo corretamente", Toast.LENGTH_LONG).show()
            }
        }

        // Carregando dados gravados
        btnCarregar.setOnClickListener {
            //Verificando se existe um dado gravado
            if (acessoSharedPref!!.contains("dado")){
                //Regatando dado
                val dadoResgatado = acessoSharedPref!!.getString("dado","")
                txvRes.text = dadoResgatado
            }
        }
    }
}
