package Bag_12_Stream;

import java.io.BufferedReader;
import java.io.FileReader;

public class Char_Stream_File {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("C:/Users/Mobiwin/Documents/Java/Dosen/Pemograman-1/Bag_12_Stream/Contoh_File.txt"));

            String baris;

            while ((baris = bufferedReader.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (Exception e) {
            System.out.println("Error Exception " + e);
        }
    }

}
