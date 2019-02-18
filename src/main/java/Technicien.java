public class Technicien extends Employe {

    public Technicien(int numeroDeSecuriteSocial, String nom, String prenom, int echelon, double nbHeure, double base) {
        super(numeroDeSecuriteSocial, nom, prenom, echelon, nbHeure, base);
    }

    public void effectuerTacheProduit(){

        System.out.println("J'effectue une tache sur le produit");
    }
}
