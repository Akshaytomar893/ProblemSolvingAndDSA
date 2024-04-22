// Pattern :
// *
// **
// ***
// ****
// *****


package Java.Patterns;

public class Pattern2 {
    void printPattern(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern2 ob = new Pattern2();
        ob.printPattern(5);
    }
}
