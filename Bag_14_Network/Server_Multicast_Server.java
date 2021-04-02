package Bag_14_Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Server_Multicast_Server {

    final static String INET_ADDR = "224.1.2.3";
    final static int PORT = 8888;

    public static void main(String[] args) throws UnknownHostException, InterruptedException {

        InetAddress addr = InetAddress.getByName(INET_ADDR);

        try (DatagramSocket serverSocket = new DatagramSocket()) {
            for (int i = 0; i < 100; i++) {
                String msg = "Pesan Nomor = " + i;

                DatagramPacket msgPacket = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, PORT);
                serverSocket.send(msgPacket);

                System.out.println("Server Kirim Pesan : " + msg);
                Thread.sleep(500);
            }
        } catch (IOException ex) {
            System.out.println("Error Pada = " + ex);
        }
    }
}
