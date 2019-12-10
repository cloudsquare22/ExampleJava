/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.java.network;

import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class ExampleBonjourCreateService {
    public static void main(String[] args) {
        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create("_example._tcp.local.", "example", 7777, "example");
            jmdns.registerService(serviceInfo);

            // Wait a bit
            Thread.sleep(25000);

            // Unregister all services
            jmdns.unregisterAllServices();

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
