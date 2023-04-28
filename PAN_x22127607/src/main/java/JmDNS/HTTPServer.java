package JmDNS;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.spi.http.HttpExchange;



    public static void main(String[] args) throws Exception {
    	
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        
        server.createContext("/index.html", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    abstract class MyHandler implements AsyncHandler {
    	
       
        public void handle(HttpExchange t) throws IOException {
            
        	String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            try (OutputStream os = t.getResponseBody()) {
				os.write(response.getBytes());
				os.close();
			} finally {
			}
            
        }
    }

}