package com.example.jocene

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class emptyBagActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty_bag)

        val startShopping: Button = findViewById(R.id.btn_startShopping)

        // Définir un écouteur de clic sur le bouton
        startShopping.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            
        }
    }
}