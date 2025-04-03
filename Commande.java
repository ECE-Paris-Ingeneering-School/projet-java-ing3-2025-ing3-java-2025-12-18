import java.util.Map;
import java.util.HashMap;

public class Commande {
    private Client client;
    private Map<Article, Integer> articles;

    public Commande(Client client) {
        this.client = client;
        this.articles = new HashMap<>();
    }

    public void ajouterArticle(Article article, int quantite) {
        articles.put(article, quantite);
    }

    public double calculerTotal() {
        double total = 0;
        for (Map.Entry<Article, Integer> entry : articles.entrySet()) {
            total += entry.getKey().calculerPrix(entry.getValue());
        }
        return total;
    }
}