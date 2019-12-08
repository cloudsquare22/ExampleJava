/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.java.network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ExampleReceiveAndSend {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            System.out.println("socket create");
            Socket socket = serverSocket.accept();
            System.out.println("accept");
            byte[] data = new byte[1024];
            int dataSize = socket.getInputStream().read(data);
            System.out.println(data);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("Example Return Data");
            
            System.out.println("end");            
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
}
