public abstract class Utilisateur {
    protected int id; // idUtilisateur dans la BDD
    protected String nom;
    protected String prenom;
    protected String email;
    protected String motDePasse;
    protected String typeUtilisateur; // "client" ou "admin"

    public Utilisateur(int id, String nom, String prenom, String email, String motDePasse, String typeUtilisateur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.typeUtilisateur = typeUtilisateur;
    }

    public int getIdUtilisateur() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getTypeUtilisateur() {
        return typeUtilisateur;
    }

}
