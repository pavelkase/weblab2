package server;

import com.fastcgi.FCGIInterface;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class RequestProcessor {

    public static String processRequest(FCGIInterface fcgi){
        try{
            FCGIInterface.request.inStream.fill();
            int contentLength = Integer.parseInt(FCGIInterface.request.params.getProperty("CONTENT_LENGTH"));
            byte[] bytes = new byte[contentLength];
            FCGIInterface.request.inStream.read(bytes, 0, contentLength);
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException | NumberFormatException e) {
            return "";
        }


    }
}
