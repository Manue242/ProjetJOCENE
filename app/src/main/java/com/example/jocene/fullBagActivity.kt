package com.example.jocene

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.toObject

class fullBagActivity : AppCompatActivity() {

        private lateinit var recyclerViewPanier: RecyclerView
        private lateinit var panierAdapter: PanierAdapter
        private lateinit var firestore: FirebaseFirestore

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_full_bag)

            // Initialisez votre RecyclerView
            recyclerViewPanier = findViewById(R.id.recyclerViewCart)
            recyclerViewPanier.layoutManager = LinearLayoutManager(this)

            // Initialisez Firestore
            firestore = FirebaseFirestore.getInstance()

            //Déclaration de la variables qui permet de gérer les actions sur le bouton
            val order: Button = findViewById(R.id.btn_order)

            //Action qui s'effectue lorsque l'on clique sur le bouton
            order.setOnClickListener{
                val intent = Intent(this,contactInfoActivity::class.java)
                startActivity(intent)
            }

            // Ajoutez un article de test à Firestore
            val article = hashMapOf(
                "nom" to "Nom de l'article",
                "quantite" to 1,
                "prix" to 10.0
            )

            firestore.collection("articles")
                .add(article)
                .addOnSuccessListener { documentReference ->
                    Log.d(TAG, "Article ajouté avec ID: ${documentReference.id}")
                }
                .addOnFailureListener { e ->
                    Log.e(TAG, "Erreur lors de l'ajout de l'article", e)
                }

            // Récupérez les articles depuis Firestore et mettez à jour RecyclerView
            firestore.collection("articles")
                .get()
                .addOnSuccessListener { documents ->
                    val articles = mutableListOf<Article>()
                    for (document in documents) {
                        val article = document.toObject<Article>()
                        articles.add(article)
                    }
                    // Initialisez l'adaptateur avec les données récupérées depuis Firestore
                    panierAdapter = PanierAdapter(articles)
                    recyclerViewPanier.adapter = panierAdapter
                }
                .addOnFailureListener { e ->
                    Log.e(TAG, "Erreur lors de la récupération des articles", e)
                }
        }

        companion object {
            private const val TAG = "FullBagActivity"
        }

    }


    //Créer un adaptateur personnalisé (PanierAdapter) en Kotlin :
    class PanierAdapter(private val articles: List<Article>) : RecyclerView.Adapter<PanierAdapter.ViewHolder>() {

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val textViewNomArticle: TextView = itemView.findViewById(R.id.textViewNomArticle)
            val btnDiminuerQuantite: Button = itemView.findViewById(R.id.btnDiminuerQuantite)
            val textViewQuantite: TextView = itemView.findViewById(R.id.textViewQuantite)
            val btnAugmenterQuantite: Button = itemView.findViewById(R.id.btnAugmenterQuantite)
            val btnSupprimerArticle: Button = itemView.findViewById(R.id.btnSupprimerArticle)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cart, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val article = articles[position]
            holder.textViewNomArticle.text = article.nom
            holder.textViewQuantite.text = article.quantite.toString()
        }

        override fun getItemCount(): Int {
            return articles.size
        }
    }

class Article(
    val nom: String,
    var quantite: Int,
    val prix: Double)
    {


    }


