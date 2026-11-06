package application;

import protocol.FastCgiRequest;

public class ApplicationHandler {
    public boolean validate(FastCgiRequest fastCgiRequest){
        double x = fastCgiRequest.getX();
        double y = fastCgiRequest.getY();
        double r = fastCgiRequest.getR();
        if(x >= -5 & x <= 5 & y >= -4 & y <= 4 & r >= 1 & r <= 3 & y % 1 == 0 & (r*2)%1==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean checkHit(FastCgiRequest fastCgiRequest){
        double x = fastCgiRequest.getX();
        double y = fastCgiRequest.getY();
        double r = fastCgiRequest.getR();
        if (y <= r & y >= 0 & x >= -r & x <= 0) {
            return true;
        }
        if (y >= 0 & x >= 0 & x*x + y*y <= (r / 2)*(r / 2)) {
            return true;
        }
        if (x >= 0 & y <= 0 & y >= x / 2 - r / 2) {
            return true;
        }else {
            return false;
        }
    }
}
