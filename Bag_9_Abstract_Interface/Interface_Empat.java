package Bag_9_Abstract_Interface;

import java.util.Scanner;

public class Interface_Empat {

    public static void main(String[] args) {

        // membuat objek
        Interface_Satu handphone = new Interface_Tiga();

        // membuat objek user
        Interface_Dua dian = new Interface_Dua(handphone);

        // kita coba nyalakan HP-nya
        dian.turnOnThePhone();

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                dian.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                dian.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                dian.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                dian.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }

            input.close();
        }
    }
}
