public class Acount {
    String nom;
    String adresse;
    double solde;
    static void afficherInfosSolde(String nom,String adresse,double solde){
      System.out.println(nom +" habite à "+"(" + adresse+")"+"- infos solde "+ solde+" DH");
    }
    public static void main(String[] args) {
        Acount acount = new Acount();
        acount.afficherInfosSolde(acount.nom = "El Alami Hassan",acount.adresse= "Safi",acount.solde = 14765.8);
        acount.afficherInfosSolde(acount.nom = "Karimi Khali",acount.adresse= "Casablanca",acount.solde = 7654.0);

    }
}


