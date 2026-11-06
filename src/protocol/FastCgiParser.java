package protocol;

public class FastCgiParser {
    String curStr;

    public static FastCgiRequest parseRequest(String inputStr){
        double x,y,r;
        try{
            String[] sb = inputStr.split("&");
            for(int i = 0; i < 3; i++){
                sb[i] = sb[i].split("=")[1];
            }

            x = Double.parseDouble(sb[0]);
            y = Double.parseDouble(sb[1]);
            r = Double.parseDouble(sb[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
        return new FastCgiRequest(x,y,r);
    }
}
