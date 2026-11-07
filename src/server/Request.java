package server;

import com.fastcgi.FCGIInterface;

public class Request {
    FCGIInterface fcgi = new FCGIInterface();

    while(fcgi.FCGIaccept() >= 0){
        try{
            String method = FCGIInterface.request.params.getProperty("REQUEST_METHOD");
            if(!"POST".equals(method)){
                
            }
        }
    }
}
