package Bag_14_Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Server_Multicast_Client {
    final static String INET_ADDR = "224.1.2.3";
    final static int PORT = 8888;

    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName(INET_ADDR);

        byte[] buf = new byte[256];

        try (MulticastSocket clientSocket = new MulticastSocket(PORT)) {
            // Joint Multicast .
            clientSocket.joinGroup(address);

            while (true) {
                // Terima data
                DatagramPacket msgPacket = new DatagramPacket(buf, buf.length);
                clientSocket.receive(msgPacket);

                String msg = new String(buf, 0, buf.length);
                System.out.println("Socket Terima Pesan : " + msg);
            }
        } catch (IOException ex) {
            System.out.println("Error ada di = " + ex);
        }
    }
}
