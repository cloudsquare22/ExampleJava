/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.java.network;

import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author shi-n
 */
public class ExampleSendAndReceive {
   public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 7777);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);) {

            Runnable runnable = () -> {
                System.out.println("Receive start");
                try {
                    int data = socket.getInputStream().read();
                    while(data != -1) {
                        System.out.print(data + " ");
                        data = socket.getInputStream().read();
                    }
                    System.out.println("end");
                }
                catch(Exception e) {
                    System.out.println(e);
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
            
            for(int i = 0; i < 5; i++) {
                printWriter.println("12345");
                Thread.sleep(5000);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }    
}
