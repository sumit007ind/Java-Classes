package LinearSearch;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
         fun(2,34,5,566,55,6,6);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));

    }
}
