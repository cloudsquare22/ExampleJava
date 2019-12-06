/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.java.network;

import java.io.PrintWriter;
import java.net.Socket;

public class ExampleClientSocket {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 7777);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);) {
            for(int i = 0; i < 5; i++) {
                printWriter.println("Example Send Data");
                Thread.sleep(5000);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
