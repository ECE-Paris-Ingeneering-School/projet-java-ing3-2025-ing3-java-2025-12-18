abstract class Utilisateur {
    protected String id;
    protected String motDePasse;
    protected String nom;

    public Utilisateur(String id, String motDePasse, String nom) {
        this.id = id;
        this.motDePasse = motDePasse;
        this.nom = nom;
    }

    public String getId() {
        return id;
    }
}