package Recursion;

public class reverse {
    static int sum =0;
    static void reverse(int n){
        if(n==0){
            return;

        }
        int rem =n%10;
        sum = sum*10+rem;
        reverse(n/10);
    }


    public static void main(String[] args) {
        reverse(24365);
        System.out.println(sum);

    }
}
