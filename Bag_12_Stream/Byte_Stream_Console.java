package Bag_12_Stream;

import java.io.IOException;

public class Byte_Stream_Console {

    public static void main(String[] args) throws IOException {

        byte[] data = new byte[10];

        System.out.println("Ketik 10 buah karakter:");

        System.in.read(data);

        System.out.println("Karakter yang anda ketik adalah:");

        for (int i = 0; i < data.length; i++) {
            System.out.println((char) data[i]);
        }
    }
}
