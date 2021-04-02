package Bag_14_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Socket {

    private static ServerSocket server = null;

    public static void main(String[] args) {
        Socket client;
        try {
            server = new ServerSocket(1234);
        } catch (IOException ie) {
            System.out.println("Socket Gagal");
            System.exit(1);
        }

        String InSt = "";

        while (true) {
            try {
                client = server.accept();

                OutputStream clientOut = client.getOutputStream();
                PrintWriter pw = new PrintWriter(clientOut, true);
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
                String St = br.readLine();

                pw.println("Dari Server : " + St + InSt);

                System.out.println("Ini Log Dari Browser = "+St);
            } catch (IOException ie) {
                System.out.println("Error Pada " + ie);
            }
        }
    }
}
