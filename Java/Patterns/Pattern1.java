// Pattern :
// *****
// *****
// *****
// *****
// *****

package Java.Patterns;

class Pattern1 {
    void printPattern(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1 ob = new Pattern1();
        ob.printPattern(5);
    }

}