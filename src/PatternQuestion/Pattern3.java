package PatternQuestion;

public class Pattern3 {
    public static void main(String[] args) {
        pattern4(5);
    }
    static void pattern4 ( int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print( col );

            }
            System.out.println();

        }
    }
}
