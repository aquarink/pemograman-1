package Bag_7_Construct;

import Bag_18_Auth.Contoh_Package_Ext;

public class Contoh_Call_Package {

    String nama_kota;

    public Contoh_Call_Package() {
        Contoh_Package_Ext ini_variabel = new Contoh_Package_Ext();
        this.nama_kota = ini_variabel.panggilKota();
    }
    
    public static void main(String[] argumennya) {

        Contoh_Call_Package variabel_lagi = new Contoh_Call_Package();
        System.out.println(variabel_lagi.nama_kota);

    }

}
