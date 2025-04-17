public class Article {
    private int idArticle;
    private String nomArticle;
    private String description;
    private double prixUnitaire;
    private double prixVrac;
    private int quantiteVrac;
    private int stock;
    private int idMarque;

    public Article(int idArticle, String nomArticle, String description, double prixUnitaire,
                   double prixVrac, int quantiteVrac, int stock, int idMarque) {
        this.idArticle = idArticle;
        this.nomArticle = nomArticle;
        this.description = description;
        this.prixUnitaire = prixUnitaire;
        this.prixVrac = prixVrac;
        this.quantiteVrac = quantiteVrac;
        this.stock = stock;
        this.idMarque = idMarque;
    }

    public int getIdArticle() {
        return idArticle;
    }
    public String getNomArticle() {
        return nomArticle;
    }

    public String getDescription() {
        return description;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }


    public double getPrixVrac() {
        return prixVrac;
    }

    public int getQuantiteVrac() {
        return quantiteVrac;
    }
    public int getStock() {
        return stock;
    }
    public int getIdMarque() {
        return idMarque;
    }

public double calculerPrix(int quantite) {
        int lots = quantite / quantiteVrac;
        int reste = quantite % quantiteVrac;
        return (lots * prixVrac) + (reste * prixUnitaire);
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + idArticle +
                ", nom='" + nomArticle + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                ", stock=" + stock +
                '}';
    }

}
