package com.example.jocene

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class deli_payMethodActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deli_pay_method)

        val arrowback: ImageView = findViewById(R.id.vec_arrowBack2_2)
        val arrowdeladress: ImageView = findViewById(R.id.arrowDeliveryAdr)
        val continuer: Button = findViewById(R.id.btn_continuer2_2)

        arrowback.setOnClickListener {
            val intent = Intent(this,contactInfoActivity::class.java)
            startActivity(intent)

        }

        arrowdeladress.setOnClickListener {
            val intent = Intent(this, deliveryAdressActivity::class.java)
            startActivity(intent)
        }

        continuer.setOnClickListener{
            val intent = Intent(this,paymentActivity::class.java)
            startActivity(intent)
        }
    }
}