import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jocene.R
import modelesDonnees.bagarticles

class BagAdapter(var articles: MutableList<bagarticles>) : RecyclerView.Adapter<BagAdapter.ArticleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cart, parent, false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articles[position]
        holder.bind(article)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewArticleName: TextView = itemView.findViewById(R.id.textViewArticleName)
        private val textViewArticlePrice: TextView = itemView.findViewById(R.id.textViewArticlePrice)
        // Ajoutez d'autres vues ici

        fun bind(article: bagarticles) {
            textViewArticleName.text = article.libelle
            textViewArticlePrice.text = article.prix.toString()
        }
    }
}
