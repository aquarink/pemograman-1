package Bag_12_Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Char_Stream_Console {
    public static void main(String[] args) throws IOException {
        char data;
        String str = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ketik sejumlah karakter, akhiri dengan \"Q\"");

        data = (char) br.read();

        while (data != 'Q') { // ELIMINASI APAPUN SETEALAH Q DAN AKAN TERUS IDDLE SAMPAI DIINPUT Q
            str += data;
            data = (char) br.read();
        }

        System.out.println("Karakter yang anda ketik : " + str);
    }
}
