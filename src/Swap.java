public class Swap {
    public static void main(String[] args) {
        int a =10;
        int b =50;

        Swap( a,b);
        System.out.println(a);

        static void swap(int a , int b){
            int temp =a;
            a=b;
            b=temp;
        }
    }
}
