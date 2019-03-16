package br.com.objbtn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Método dispara quando o btnRaphael for tocado
        btnRaphael.setOnClickListener {
            txvRes.text = "Sanzio"
        }
        btnLeonardo.setOnClickListener {
            txvRes.text = "Da Vince"
        }

        //Método dispara quando o btnLeonardo for tocado
    }
}
