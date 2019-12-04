/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.java.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ExampleServerUDP {
    private static final int EXHOMAX = 255;
    
    public static void main(String[] args) {
        try {
            DatagramSocket​ datagramSocket = new DatagramSocket​(7777);
            DatagramPacket datagramPacket = new DatagramPacket(new byte[EXHOMAX], EXHOMAX);
            while(true) {
                datagramSocket.receive(datagramPacket);
                for(int i = 0; i < datagramPacket.getLength(); i++) {
                    System.out.print(datagramPacket.getData()[i]);
                    System.out.print(" ");
                }
                System.out.println();
                datagramPacket.setLength(EXHOMAX);
            }
        }
        catch(Exception e) {
        }
    }
}
