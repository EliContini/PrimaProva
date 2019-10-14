/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc15
 */
public class ClientTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner in = new Scanner (System.in);
        System.out.print(">");
        String message ="Tassone" + in.nextLine();
        
        
            Socket clientSocket = new Socket ("10.102.0.65",3333);
            DataOutputStream out= new DataOutputStream(clientSocket.getOutputStream());
            out.writeBytes(message + "\n");
            out.flush();
            out.close();
        
        }
    }
    

