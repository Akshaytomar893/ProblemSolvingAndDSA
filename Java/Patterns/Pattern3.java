// Pattern :
// 1
// 12
// 123
// 1234
// 12345


package Java.Patterns;

public class Pattern3 {
    void printPattern(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern3 ob = new Pattern3();
        ob.printPattern(5);
    }
}
