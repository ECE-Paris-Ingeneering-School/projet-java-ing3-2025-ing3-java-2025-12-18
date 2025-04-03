import java.util.List;
import java.util.ArrayList;

public class Client extends Utilisateur {
    private List<Commande> historiqueCommandes;

    public Client(String id, String motDePasse, String nom) {
        super(id, motDePasse, nom);
        this.historiqueCommandes = new ArrayList<>();
    }

    public void ajouterCommande(Commande commande) {
        historiqueCommandes.add(commande);
    }

    public List<Commande> getHistoriqueCommandes() {
        return historiqueCommandes;
    }
}
