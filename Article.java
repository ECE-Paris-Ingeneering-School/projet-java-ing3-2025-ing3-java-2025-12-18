public class Article {
    private String nom;
    private String marque;
    private double prixUnitaire;
    private double prixVrac;
    private int quantiteVrac;

    public Article(String nom, String marque, double prixUnitaire, double prixVrac, int quantiteVrac) {
        this.nom = nom;
        this.marque = marque;
        this.prixUnitaire = prixUnitaire;
        this.prixVrac = prixVrac;
        this.quantiteVrac = quantiteVrac;
    }

    public double calculerPrix(int quantite) {
        int lots = quantite / quantiteVrac;
        int reste = quantite % quantiteVrac;
        return (lots * prixVrac) + (reste * prixUnitaire);
    }
}
