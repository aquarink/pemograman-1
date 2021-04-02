package Bag_7_Construct;

public class Contoh_Contructor {

    public Contoh_Contructor() {

        System.out.println("Ini adalah contructor");

    }

    public Contoh_Contructor(String parameter_satu) {

        System.out.println("Ini adalah dengan parameters = " + parameter_satu);

    }

    public static void main(String[] ini_argumen) {

        new Contoh_Contructor();
        new Contoh_Contructor("ini data parameter");
    }
}
