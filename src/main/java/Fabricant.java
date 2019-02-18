public class Fabricant extends Employe {

    private int nbUnitesProduites;
    private double tauxComissionUnite ;

    public Fabricant(int numeroDeSecuriteSocial, String nom, String prenom, int echelon, double nbHeure, double base, int nbUnitesProduites, double tauxComissionUnite) {
        super(numeroDeSecuriteSocial, nom, prenom, echelon, nbHeure, base);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxComissionUnite = tauxComissionUnite;
    }

    public void fabriquerProduit(){

        System.out.println("Je fabrique un produit");

    }
}
