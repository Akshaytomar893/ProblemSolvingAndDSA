package Java.BasicRecursion;

public class Counting {
    void recursiveCounting(int x, int y){
        if(x>y){
            return;
        } else{
            System.out.print(x+", ");
            recursiveCounting(x+1, y);
        }
    }
    public static void main(String[] args) {
        Counting ob = new Counting();
        ob.recursiveCounting(1, 15);
    }
}
