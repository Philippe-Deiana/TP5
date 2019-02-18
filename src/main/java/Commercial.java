public class Commercial extends Employe {

    private double chiffreAffaires ;
    private double tauxComission ;

    public Commercial(int numeroDeSecuriteSocial, String nom, String prenom, int echelon, double nbHeure, double base, double chiffreAffaires, double tauxComission) {
        super(numeroDeSecuriteSocial, nom, prenom, echelon, nbHeure, base);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxComission = tauxComission;
    }

    public void negocierTransaction(){

        System.out.println("Je négocie une transaction");
    }


}
