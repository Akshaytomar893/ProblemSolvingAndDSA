package Java.BasicMaths;

import java.util.ArrayList;

public class FindAllDivisor {
    void findDivisor(int x){
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i =1; i<= Math.sqrt(x); i++){
            if(x % i == 0){
                divisors.add(i);

                if(i != x/i){
                    divisors.add(x/i);
                }
            }
        }
        System.out.println(divisors);
    }
    
    public static void main(String[] args) {
        FindAllDivisor ob = new FindAllDivisor();
        ob.findDivisor(15);
    }
}
