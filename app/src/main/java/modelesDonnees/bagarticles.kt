package modelesDonnees

class bagarticles {
    val prix: Any = TODO()
    val libelle: CharSequence?

    constructor(libelle: String, prix: Double, couleur: String, designation: String, image: String)

    data class Article(
        val libelle: String,
        val prix: Double,
        val couleur: String,
        val designation: String,
        val image: String // Suppose que l'image est stockée sous forme de lien URL
    )
}