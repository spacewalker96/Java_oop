public class Acount2 extends Acount {
    String nom;
    String adresse;
    double solde;
    double calculerInterer(double tauxInteret){
        double inter;
        return inter=this.solde*tauxInteret/100;
    }
    static void afficherInfosSolde(String nom,String adresse,double solde,double inter){
        System.out.println(nom +" habite à "+"(" + adresse+")"+"- infos solde "+ solde+" DH et solde avec interet: "+inter+" DH");
    }


    public static void main(String[] args) {
        Acount2 acount2 = new Acount2();
        //acount2.calculerInterer(7);

        acount2.afficherInfosSolde(acount2.nom = "El Alami Hassan",acount2.adresse= "Safi",acount2.solde = 14765.8,acount2.calculerInterer(7));
        acount2.afficherInfosSolde(acount2.nom = "Karimi Khali",acount2.adresse= "Casablanca",acount2.solde = 7654.0,acount2.calculerInterer(7));

    }
}
