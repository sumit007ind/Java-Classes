package PatternQuestion;

public class Pattern3 {
    public static void main(String[] args) {
        pattern4(5);
    }
    static void pattern4 ( int n){
        for (int row = 1; row <=n; row++) {
            for (int col = row; col <=n; col++) {
                System.out.print( "* " );

            }
            System.out.println();

        }
    }
}
