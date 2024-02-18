package com.example.jocene

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class emptyBagActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty_bag)

        val btn_startShopping: Button = findViewById(R.id.btn_startShopping)

        // Définir un écouteur de clic sur le bouton
        btn_startShopping.setOnClickListener {
            
        }
    }
}