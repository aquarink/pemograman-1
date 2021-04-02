package Bag_8_Inheritance;

public class Contoh_Super_Extends extends Contoh_Super {

    String warna_lain;

    public Contoh_Super_Extends(String warna_warna) {
        super("pelangi");
        this.warna_lain = warna_warna;
    }

    public static void main(String array[]) {

        Contoh_Super_Extends ini_variabel = new Contoh_Super_Extends("biru muda");

        System.out.println("INI WARNA SUPER = "+ini_variabel.getWarna());
        System.out.println("INI WARNA THIS = "+ini_variabel.warna_lain);
    }
}
