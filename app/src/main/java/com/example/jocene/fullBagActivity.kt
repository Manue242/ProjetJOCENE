package com.example.jocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class fullBagActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_bag)
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

            // Mettez en place les listeners pour les boutons (diminuer, augmenter, supprimer)
            // ...

            // Assurez-vous de mettre à jour les vues en fonction de l'état de l'article
            // ...
        }

        override fun getItemCount(): Int {
            return articles.size
        }
    }

    //Utiliser l'adaptateur dans votre activité en Kotlin
    class PanierActivity : AppCompatActivity() {

        private lateinit var recyclerViewPanier: RecyclerView
        private lateinit var panierAdapter: PanierAdapter

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_full_bag)

            // Initialisez votre RecyclerView
            recyclerViewPanier = findViewById(R.id.recyclerViewCart)
            recyclerViewPanier.layoutManager = LinearLayoutManager(this)

            // Initialisez votre liste d'articles (à remplacer par votre propre logique de récupération des articles)
            val articles = mutableListOf<Article>()
            // Ajoutez des articles à votre liste...

            // Initialisez l'adaptateur
            panierAdapter = PanierAdapter(articles)

            // Associez l'adaptateur à votre RecyclerView
            recyclerViewPanier.adapter = panierAdapter
        }
    }
}

data class Article(
    val nom: String,
    var quantite: Int,
    val prix: Double
    // Ajoutez d'autres attributs au besoin
)
