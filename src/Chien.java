import java.util.Scanner;

public class Chien {
    public String name ;
    Scanner sc = new Scanner(System.in);
     String aboyer() {
         System.out.println("lorsque aboyer :  ");
            return sc.nextLine();
    }
    String manger() {
        System.out.println("lorsque manger :  ");
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Chien ch1 = new Chien();
        System.out.println("Call Rex");
        System.out.println(ch1.name="Rex "+"dit "+ch1.aboyer()+" "+ ch1.manger());
        System.out.println("Call Max");
        System.out.println(ch1.name="Max "+"dit "+ch1.aboyer()+" "+ ch1.manger());
    }
}

//without Scanner
/*
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
 */