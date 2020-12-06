public class Chien2 {
    String nom;
    static String aboyer(String sens){
        return  sens;
    }
    static String manger(String qlqc){
        return qlqc;
    }

    public static void main(String[] args) {
        Chien2 ch = new Chien2();
        System.out.println("Je suis en colère. "+ch.aboyer("Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! - "+ch.manger("Je mange de la viande")));
        System.out.println("Je ne suis pas du tout en colère. "+ch.aboyer("Iwiw !! awaw !!  - "+ch.manger("Je mange du poisson")));
    }
}


