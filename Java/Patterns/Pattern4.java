// Pattern
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 


package Java.Patterns;

public class Pattern4 {
    void printPattern(int x) {
        for (int i = 0; i < x; i++) {
            int noOfSpaces = x-(i+1);
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i+1); k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern4 ob = new Pattern4();
        ob.printPattern(5);
    }
}
