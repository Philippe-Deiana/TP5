public class GestionEmployes {

    public static void main(String[] args) {

        Employe un = new EmployeBuilder()
                .setBase(10)
                .setEchelon(5)
                .setNom("toto")
                .setNbHeure(35)
                .setPrenom("jojo")
                .setNumeroDeSecuriteSocial(454464646)
                .createEmploye();
        System.out.println(un);
    }

}
