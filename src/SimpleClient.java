import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        String serverIP = "127.0.0.1"; // localhost
        int port = 8080;
        String hello = "Hello from client";

        try {
            // Connect to the server
            Socket clientSocket = new Socket(serverIP, port);
            System.out.println("Connected to server");

            // Send message to server
            OutputStream output = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println(hello);
            System.out.println("Hello message sent");

            // Read response from server
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String response = reader.readLine();
            System.out.println("Message from server: " + response);

            // Close the socket
            clientSocket.close();
        } catch (IOException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
    }
}
