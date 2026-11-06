package protocol;

public class FastCgiRequest {
    double x;
    double y;
    double r;

    public FastCgiRequest(double x, double y, double r){
        this.r = r;
        this.x = x;
        this.y = y;
    }


    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }
}
