public class EmployeBuilder {
    private int numeroDeSecuriteSocial;
    private String nom;
    private String prenom;
    private int echelon;

    public EmployeBuilder setNumeroDeSecuriteSocial(int numeroDeSecuriteSocial) {
        this.numeroDeSecuriteSocial = numeroDeSecuriteSocial;
        return this;
    }

    public EmployeBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public EmployeBuilder setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public EmployeBuilder setEchelon(int echelon) {
        this.echelon = echelon;
        return this;
    }

    public Employe createEmploye() {
        return new Employe(numeroDeSecuriteSocial, nom, prenom, echelon);
    }
}