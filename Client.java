public class Client extends Utilisateur {

    public Client(int id, String nom, String prenom, String email, String motDePasse) {
        super(id, nom, prenom, email, motDePasse, "client"); // toujours "client"
    }

    // Constructeur sans ID (pour l'inscription avant l’insertion en BDD)
    public Client(String nom, String prenom, String email, String motDePasse) {
        super(0, nom, prenom, email, motDePasse, "client");
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", typeUtilisateur='" + typeUtilisateur + '\'' +
                '}';
    }
}
