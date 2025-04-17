import java.sql.Timestamp;

public class Commande {
    private int idCommande;
    private String idClient;
    private Timestamp dateCommande;
    private String statut;

    public Commande(int idCommande, String idClient, Timestamp dateCommande, String statut) {
        this.idCommande = idCommande;
        this.idClient = idClient;
        this.dateCommande = dateCommande;
        this.statut = statut;
    }


    public int getIdCommande() {
        return idCommande;
    }

    public String getIdClient() {
        return idClient;
    }


    public Timestamp getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Timestamp dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
