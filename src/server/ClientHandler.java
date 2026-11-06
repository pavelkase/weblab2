package server;

import com.fastcgi.FCGIInterface;

public class ClientHandler {

    public static void handleRequest(FCGIInterface fcgi){
        long scriptTime = System.nanoTime();
        String method = FCGIInterface.request.params.getProperty("REQUEST_METHOD");

        if("POST".equals(method)){
            RequestProcessor.processRequest(fcgi);
        }else{
            //405
        }
    }
}
