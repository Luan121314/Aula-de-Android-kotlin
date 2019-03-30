package br.com.telalancamento

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class TelaLaunch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Retirando a barra de status
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_tela_launch)

        //Passando para proxima janela, deposi de um espaço de tempo
        Handler().postDelayed({
            //Criando intent para main
            val intentParaMain = Intent(this, MainActivity::class.java)

            //Finalizando tela atual
            finish()

            //Executando o intent
            startActivity(intentParaMain)



        }, 2000)
    }
}
