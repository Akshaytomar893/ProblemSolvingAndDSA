package Java.BasicMaths;

public class ArmstrongNumber {

    void checkIfArmstrong(int x) {
        int digits = 0, sum = 0, temp_x =x;
        while(temp_x > 0){
            digits++;
            temp_x/=10;
        }
        temp_x =x;
        while(temp_x > 0){
            sum += Math.pow(temp_x%10, digits);
            temp_x/=10;
        }
        if(x==sum){
            System.out.println("No is Armstrong");
        }else{
            System.out.println("No is not Armstrong");
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber ob = new ArmstrongNumber();
        ob.checkIfArmstrong(153);
        ob.checkIfArmstrong(371);
        ob.checkIfArmstrong(169);
    }
}
