/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.java.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ExampleClientUDP {
    public static void main(String[] args) {
        String sendData = "Send Data Example";
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            DatagramPacket datagramPacke = new DatagramPacket(sendData.getBytes(), sendData.getBytes().length, InetAddress.getByName("localhost"), 7777);
            datagramSocket.send(datagramPacke);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
