import java.util.Arrays;
import java.util.Scanner;

public class Ainput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr= new int [10];
//        arr[0] = 20;
//        arr[1] = 30;
//        arr[2] = 240;
//        arr[3] = 2065;
//        arr[4] = 260;
//        arr[5] = 207;
//        arr[6] = 277;
//        arr[7] = 20;
//        arr[8] = 20;
//        System.out.println(arr[4]);
//        for (int i=0; i<arr.length; i++)
//        {
//            arr[i] = in.nextInt();
//        }
        String[] str = new String[4];
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
