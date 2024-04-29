package Java.BasicMaths;

public class CountDigit {

    void methodOne(int x){
        int noOfDigit = 0;
        while (x > 0) {
            noOfDigit++;
            x = x/10;
        }
        System.out.println(noOfDigit);

    }
    void methodTwo(int x){
        int noOfDigits = (int) Math.floor(Math.log10(x) + 1);
        System.out.println(noOfDigits);
    }
    
    public static void main(String[] args){
        CountDigit ob = new CountDigit();
        ob.methodOne(12345);
        ob.methodTwo(123);
    }
}
