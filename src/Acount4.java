public class Acount4 extends Acount3{
    double m;
    void setRet(double m){
        this.m = m;
    }
    double getRet(){
        return m;
    }
    double retier(double m){
        return this.solde-m;
    }

    public static void main(String[] args) {
        Acount4 acount4 = new Acount4();
        acount4.setNom("hosni");
        acount4.setSold(564554);
        acount4.setRet(5437);
        if(acount4.getSold()>acount4.getRet()){
        System.out.println(acount4.retier(43));}
        else {
            System.out.println("Error");
        }
    }
}
