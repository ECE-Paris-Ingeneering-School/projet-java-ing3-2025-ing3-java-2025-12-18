import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Création d'un client
        Client client = new Client("client1", "password123", "Jean Dupont");

        // Création d'articles
        Article briquet = new Article("Briquet", "Bic", 0.50, 4.00, 10);
        Article stylo = new Article("Stylo", "Parker", 1.20, 10.00, 10);

        // Création d'une commande
        Commande commande = new Commande(client);
        commande.ajouterArticle(briquet, 12);
        commande.ajouterArticle(stylo, 5);

        // Ajout de la commande au client
        client.ajouterCommande(commande);

        // Affichage du total de la commande
        System.out.println("Total de la commande: " + commande.calculerTotal() + " €");
    }
}

