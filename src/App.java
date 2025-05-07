import java.io.*;
import java.net.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Socket client = null;

        int portnumber = 1234;
        if (args.length >= 1) {
            portnumber = Integer.parseInt(args[0]);
        }

        for (int i = 0; i < 10; i++) {
            String msg = " ";

            client = new Socket(InetAddress.getLocalHost(), portnumber);
            System.out.println("Client socket is created " + client);

            OutputStream clientOut = client.getOutputStream();
            PrintWriter pw = new PrintWriter(clientOut, true);

            InputStream clientIn = client.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
        }
    }
}
