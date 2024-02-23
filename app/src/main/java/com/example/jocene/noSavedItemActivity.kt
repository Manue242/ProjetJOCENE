package com.example.jocene

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class noSavedItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_saved_item)

        val startShopping: Button = findViewById(R.id.btn_startshopping2)

        // Définir un écouteur de clic sur le bouton
        startShopping.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}