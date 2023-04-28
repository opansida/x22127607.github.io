package JmDNS;

import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

abstract class MyServiceListener implements ServiceListener {
    public void serviceAdded1(ServiceEvent event) {
        System.out.println("Service added: " + event.getInfo());
    }

    public void serviceRemoved1(ServiceEvent event) {
        System.out.println("Service removed: " + event.getInfo());
    }

    public void serviceResolved1(ServiceEvent event) {
        System.out.println("Service resolved: " + event.getInfo());
    }
}


