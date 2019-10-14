/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author pc15
 */
public class ServerTcp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String message;
        ServerSocket welcomSocket = new ServerSocket(3333);
        for (;;) {
            Socket connectionSocket = welcomSocket.accept();

            // Usate gli Stream e non lo Scanner
            Scanner in = new Scanner(connectionSocket.getInputStream());
            message = in.nextLine();

            System.out.println("il server ha ricevuto dal nodo: " + connectionSocket.getRemoteSocketAddress() + " che ci scrive: " + message);

        }
    }

}
