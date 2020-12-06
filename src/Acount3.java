public class Acount3 extends Acount2 {
        double getSold(){
            return solde;
        }
        String getNom(){

            return nom;
        }
        String getAdresse(){

            return adresse;
        }
        void setSold(double solde){
            this.solde = solde;
        }
    public void setNom(String nom) {
        if (!nom.equals("")) {
            this.nom = nom;
        }
    }
        void setAdresse(String adresse){
            this.adresse = adresse;
        }
}
