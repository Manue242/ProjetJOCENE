package com.example.jocene

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.toObject
import modelesDonnees.bagarticles
import BagAdapter


class fullBagActivity: AppCompatActivity() {
    private lateinit var adapter: BagAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_bag)


        //Déclaration de la variables qui permet de gérer les actions sur le bouton
        val order: Button = findViewById(R.id.btn_order)

        //Action qui s'effectue lorsque l'on clique sur le bouton
        order.setOnClickListener {
            val intent = Intent(this, contactInfoActivity::class.java)
            startActivity(intent)
        }

        // Récupérer une référence à votre RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewCart)

        // Configurez le LayoutManager pour votre RecyclerView (par exemple, LinearLayoutManager)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Créez une instance de votre adaptateur
        adapter = BagAdapter(ArrayList()) // Nous passons une liste vide pour le moment

        // Liez votre adaptateur à votre RecyclerView
        recyclerView.adapter = adapter

        // Récupérer les données d'articles depuis Firestore
        getArticlesFromFirestore()

    }

     private fun getArticlesFromFirestore() {
        val db = FirebaseFirestore.getInstance()
        db.collection("panierCollection")
            .get()
            .addOnSuccessListener { documents ->
                val articlesList: MutableList<bagarticles> = mutableListOf()
                for (document in documents) {
                    val libelle = document.getString("libelle") ?: ""
                    val prix = document.getDouble("prix") ?: 0.0
                    val couleur = document.getString("couleur") ?: ""
                    val designation = document.getString("designation") ?: ""
                    val image = document.getString("image") ?: ""
                    val article = bagarticles(libelle,prix, couleur, designation, image)
                    articlesList.add(article)
                }
                adapter.articles = articlesList

                adapter.notifyDataSetChanged()
            }
            .addOnFailureListener { exception ->
                Log.w(TAG, "Error getting documents: ", exception)
            }
    }
}



