import java.util.Arrays;

public class VarStrings {
    public static void main(String[] args) {
        fun("sumit, Sharma, Naam  , Hai , Mera");
    }
    static void fun(String...v){
        System.out.println(Arrays.toString(v));

    }
}
