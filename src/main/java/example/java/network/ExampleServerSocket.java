/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.java.network;

import java.net.ServerSocket;
import java.net.Socket;
// import java.util.Scanner;

public class ExampleServerSocket {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            System.out.println("socket create");
            Socket socket = serverSocket.accept();
            System.out.println("accept");
//            Scanner scanner = new Scanner(socket.getInputStream());
            int data = socket.getInputStream().read();
            while(data != -1) {
                System.out.print(data + " ");
                data = socket.getInputStream().read();
            }
            System.out.println("end");
            
//            while(scanner.hasNext() == true) {
//                System.out.println(scanner.nextLine());
//            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
