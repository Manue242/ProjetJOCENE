package com.example.jocene

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class noSavedItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_saved_item)

        setupBottomNavigation()

        val startShopping: Button = findViewById(R.id.btn_startshopping2)

        // Définir un écouteur de clic sur le bouton
        startShopping.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }

    private fun setupBottomNavigation() {
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.shoppingbag -> {
                    navigateToShoppingbag()
                    return@setOnItemSelectedListener true
                }
                else -> return@setOnItemSelectedListener false
            }
        }
    }

    private fun navigateToShoppingbag() {
        val accessBag: Button = findViewById(R.id.shoppingbag)

        accessBag.setOnClickListener {
            val intent = Intent(this,emptyBagActivity::class.java)
            startActivity(intent)

        }
    }

    private fun navigateToComment() {

    }

    private fun navigateToWishlist() {
        val accessWishlist: Button = findViewById(R.id.wish_list)

        accessWishlist.setOnClickListener {
            val intent = Intent(this,noSavedItemActivity::class.java)
            startActivity(intent)

        }
    }

    private fun navigateToUserprofile() {
        val accessAccount: Button = findViewById(R.id.user_profile)

        accessAccount.setOnClickListener {
            val intent = Intent(this,Compte_Activity::class.java)
            startActivity(intent)

        }
    }
}