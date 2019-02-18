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

        Employe deux = new EmployeBuilder()
                .setBase(100)
                .setEchelon(9)
                .setNom("tata")
                .setNbHeure(50)
                .setPrenom("mimi")
                .setNumeroDeSecuriteSocial(84654656)
                .createEmploye();

        System.out.println(un + "\n" + deux);

        Employe co ,fab, tech ;

        co= new CommercialBuilder()
                .setChiffreAffaires(500)
                .setTauxComission(465)
                .createCommercial();

        System.out.println(co);
    }

}
