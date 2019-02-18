public class Employe{

    private int numeroDeSecuriteSocial;
    private String nom;
    private String prenom;
    private int echelon;
    private double base;
    private double nbHeure ;

    public Employe(int numeroDeSecuriteSocial, String nom, String prenom, int echelon, double nbHeure, double base) {
        this.numeroDeSecuriteSocial = numeroDeSecuriteSocial;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.nbHeure = nbHeure;
        this.base = base;
    }

    public double salaire(){

        double salaireBrut = base * nbHeure ;
        double salaireNet = 0.8*salaireBrut ;
        return  salaireBrut;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "numeroDeSecuriteSocial=" + numeroDeSecuriteSocial +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", echelon=" + echelon +
                ", base=" + base +
                ", nbHeure=" + nbHeure +
                ", salaire brut=" + salaire() +
                ", salaire net=" + 0.8*salaire() +
                '}';
    }
}
