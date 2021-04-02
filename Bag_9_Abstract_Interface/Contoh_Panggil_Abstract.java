package Bag_9_Abstract_Interface;

public class Contoh_Panggil_Abstract extends Contoh_Abstract {

    @Override
    public void abstrak() {
        System.out.println("ini abstract dari file Contoh_Abstract");
    }

    public static void main(String[] argument) {

        Contoh_Panggil_Abstract ini_variabel = new Contoh_Panggil_Abstract();
        ini_variabel.abstrak();

    }
}
