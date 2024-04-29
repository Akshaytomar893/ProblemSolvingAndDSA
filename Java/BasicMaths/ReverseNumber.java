package Java.BasicMaths;

public class ReverseNumber {
    void reverseMyNumber(int x){
        int revNum =0;
        while(x>0){
            int digit = x % 10;
            revNum = revNum * 10 + digit;
            x/=10;
        }
        System.out.println(revNum);
    }
    public static void main(String[] args){
        ReverseNumber ob = new ReverseNumber();
        ob.reverseMyNumber(1234);

    }
}
