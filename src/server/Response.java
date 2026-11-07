package server;

import com.fastcgi.FCGIInterface;

public class Response {
    private static StringBuilder sb = new StringBuilder();



    public static String responseBuild(String status, FCGIInterface fcgi){
        StringBuilder sb = new StringBuilder();


        if("200".equals(status)){
            return sb.toString();
        } else if("405".equals(status)){
            return sb.toString();
        }else{
            return sb.toString();
        }
    }
}
