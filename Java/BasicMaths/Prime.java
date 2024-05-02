package Java.BasicMaths;

public class Prime {
    void checkPrime(int x){
        boolean flag = false;
        for(int i = 2; i<= x/2; i++){
            if(x % i == 0){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is Prime");
        }
    }
    
    public static void main(String[] args) {
        Prime ob = new Prime();
        ob.checkPrime(3);
        ob.checkPrime(5);
        ob.checkPrime(7);
        ob.checkPrime(9);
        ob.checkPrime(17);

    }
}
