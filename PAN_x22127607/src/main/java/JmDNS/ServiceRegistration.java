package JmDNS;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class ServiceRegistration {

    public static void main(String[] args) throws InterruptedException {

        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			System.out.println("Registration: InetAddress.getLocalHost():" + InetAddress.getLocalHost());

            // Register a service
			ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "example", 8080, "path=index.html");
			jmdns.registerService(serviceInfo);
            
            // Wait a bit
            Thread.sleep(20000);

            // Unregister all services
            //jmdns.unregisterAllServices();
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}