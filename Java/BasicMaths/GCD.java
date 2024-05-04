package Java.BasicMaths;

public class GCD {
    void findGCD(int x, int y){
        while (x > 0 && y > 0 ) {
            if(x > y){
                x = x%y;
            }
            else{
                y = y%x;
            }
        }
        if(x == 0){
            System.out.println(y);
        }
        else System.out.println(x);
    }
    
    public static void main(String[] args) {
        GCD ob = new GCD();
        ob.findGCD(5,15);
    }
}
