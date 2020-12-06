public class Chien {
    public String name ;
    static String aboyer() {
        return " dit wwaaaarf";
    }
    static String manger() {
        return " Je mange de la viande";
    }

    public static void main(String[] args) {
        Chien ch1 = new Chien();
        System.out.println(ch1.name="Rex"+ch1.aboyer()+ ch1.manger());
        System.out.println(ch1.name="Max"+ch1.aboyer()+ ch1.manger());
    }
}