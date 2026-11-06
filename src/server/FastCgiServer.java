package server;

import com.fastcgi.FCGIInterface;

public class FastCgiServer {
    public void start(FCGIInterface fcgi){
        while(fcgi.FCGIaccept() >= 0){
           ClientHandler.handleRequest(fcgi);
        }
    }
}
