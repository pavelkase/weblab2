import com.fastcgi.FCGIInterface;

public class Main{
    public static void main (String[] args){
        FCGIInterface fcgi = new FCGIInterface();

        while(fcgi.FCGIaccept() >= 0){
            long scriptTime = System.nanoTime();
            String method = FCGIInterface.request.params.getProperty("REQUEST_METHOD");

            if(method.equals("POST")){

            }
            else{
                //405 error
            }
        }
    }
}
