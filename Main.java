import java.util.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Création d'un client
        Client client = new Client(1, "Dupont", "Jean", "j@e", "1234");

        // Création d'articles
        //Article briquet = new Article(1, "briquet", "Bic", 0.50, 4.00, 10, 30, 1);
        //Article stylo = new Article(2, "stylo", "Parker", 1.20, 10.00, 10, 50, 2);
        // Création d'une commande
        //Panier panier = new Panier(client);
        //panier.ajouterArticle(briquet, 12);
        //panier.ajouterArticle(stylo, 5);


        // Insertion des articles dans la base de données
        //ArticleDAO.addArticle(briquet);
        //ArticleDAO.addArticle(stylo);

        // Affichage de tous les articles en base
        List<Article> liste = ArticleDAO.getAllArticles();
        System.out.println("📦 Articles disponibles en base :");
        for (Article a : liste) {
            System.out.println(a);
        }


        new Accueil();

        //Test connexion BDD
        try {
            var connexion = ConnexionBD.getConnexion();
            System.out.println("✅ Connexion réussie à la base de données !");
            connexion.close();
        } catch (Exception e) {
            System.err.println("❌ Erreur de connexion : " + e.getMessage());
        }

    }
}

