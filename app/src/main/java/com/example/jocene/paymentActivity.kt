package com.example.jocene

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class paymentActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val arrowback: ImageView = findViewById(R.id.vec_arrowBack2_4)
        val pay: Button = findViewById(R.id.btn_pay)

        arrowback.setOnClickListener {
            val intent = Intent(this,deli_payMethodActivity::class.java)
            startActivity(intent)

        }

        pay.setOnClickListener{

        }
    }
}