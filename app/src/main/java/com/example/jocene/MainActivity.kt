package com.example.jocene

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val inscrire: TextView = findViewById(R.id.Txt_Inscription)
        inscrire.setOnClickListener {
            val intent = Intent( this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }

    fun register(view: View) {}

}