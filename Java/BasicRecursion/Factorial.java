package Java.BasicRecursion;

public class Factorial {
    int fac(int n){
        if(n == 1){
            return n;
        }
        else{
            return n*fac(n-1);
        }
    }

    public static void main(String[] args) {
        Factorial ob = new Factorial();
        System.out.println(ob.fac(5));
    }
}
