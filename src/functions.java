import java.sql.SQLOutput;
import java.util.Scanner;

public class functions {

    public static void main(String[] args) {
      int ans =  sum2();
        System.out.println(ans);

    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1= in.nextInt();
        System.out.println("Enter the second number ");
        int num2 = in.nextInt();
        int sum = num1 +num2;
        return sum;
    }
    static void sum (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st number ");
        int num1= in.nextInt();
        System.out.println("Enter the 2nd number ");
        int num2 = in.nextInt();
        int sum = num1 +num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

    }
}
