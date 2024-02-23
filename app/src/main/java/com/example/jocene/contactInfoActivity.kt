package com.example.jocene

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class contactInfoActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_info)

        //Déclaration des variables qui permettent de gérer les actions sur la flèche retour et le bouton
        val arrowback: ImageView = findViewById(R.id.vec_arrowBack2_1)
        val continuer: Button = findViewById(R.id.btn_continuer2_1)

        //Action qui s'effectue lorsque l'on clique sur la flèche de retour
        arrowback.setOnClickListener {
            val intent = Intent(this,fullBagActivity::class.java)
            startActivity(intent)

        }

        //Action qui s'effectue lorsque l'on clique sur le bouton
        continuer.setOnClickListener{
            val intent = Intent(this,deli_payMethodActivity::class.java)
            startActivity(intent)
        }
    }
}