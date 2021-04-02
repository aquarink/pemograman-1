package Bag_13_Threads;

public class Contoh_Runable implements Runnable {

    Thread ini_thread;

    Contoh_Runable(String ini_parameter) {
        ini_thread = new Thread(this, ini_parameter);
        ini_thread.start();
    }

    public void run() {

        String variabelnya = ini_thread.getName();

        for (int i = 0; i < 100; i++) {
            System.out.println(variabelnya);
        }
    }

    public static void main(String args[]) {
        Contoh_Runable pnt1 = new Contoh_Runable("A");
        Contoh_Runable pnt2 = new Contoh_Runable("B");
        Contoh_Runable pnt3 = new Contoh_Runable("C");
        Contoh_Runable pnt4 = new Contoh_Runable("D");

        System.out.println("Threads Berjalan");

        try {
            pnt1.ini_thread.join();
            pnt2.ini_thread.join();
            pnt3.ini_thread.join();
            pnt4.ini_thread.join();
        } catch (InterruptedException ie) {
            System.out.println("Kalau Ada Error " + ie);
        }

        System.out.println("Done"); // dicetak terakhir
    }
}