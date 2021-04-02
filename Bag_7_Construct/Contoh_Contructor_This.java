package Bag_7_Construct;

public class Contoh_Contructor_This {

    public String nama;

    public Contoh_Contructor_This() {

        this.nama = "Contruct Default";

    }

    public Contoh_Contructor_This(String ini_parameters) {

        this.nama = ini_parameters;

    }

    public static void main(String[] ini_argumen) {

        Contoh_Contructor_This variabel_satu = new Contoh_Contructor_This();
        System.out.println(variabel_satu.nama);

        Contoh_Contructor_This variabel_dua = new Contoh_Contructor_This("ini data parameter");
        System.out.println(variabel_dua.nama);
    }
}
