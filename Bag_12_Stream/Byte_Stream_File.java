package Bag_12_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Byte_Stream_File {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream(
                    "C:/Users/Mobiwin/Documents/Java/Dosen/Pemograman-1/Bag_12_Stream/Contoh_File.txt");

            FileOutputStream fileOutputStream = new FileOutputStream(
                    "C:/Users/Mobiwin/Documents/Java/Dosen/Pemograman-1/Bag_12_Stream/Contoh_File_Copy.txt");

            int i;
            while ((i = fileInputStream.read()) != -1) {

                fileOutputStream.write(i);
                System.out.print((char) i);
            }

            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println("Error Exception " + e);
        }

    }
}
