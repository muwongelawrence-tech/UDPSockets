import java.net.*;
import java.io.*;
public class UDPServerDemo {
    public static void main(String args[]) throws UnknownHostException {

        // instantiating both the server and the client.
        UDPServer server_socket = new UDPServer();
        UDPClient client_socket = new UDPClient();

        byte [] m = args[0].getBytes();

        //InetAddress aHost = InetAddress.getByName(args[1]);
        InetAddress aHost = InetAddress.getByName(args[1]);

        System.out.println("------------Setting up the server-----------------------");
        server_socket.server();
        System.out.println("-------------client sending requests to the server-----------");
        client_socket.client(m, aHost);

    }
}

