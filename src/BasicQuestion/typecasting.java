package BasicQuestion;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = BasicQuestion.input.nextFloat();
//        System.out.println(num);
//          float num = (int)(50.1315f);
//          System.out.println(num);
//
//          int a = 257;
//          byte b = (byte)(a);
//          System.out.println(a);
//        byte a= 50;
//        byte b= 40;
//        byte c= 30;
//        int d = (a+b+c)/2;
//        System.out.println(d);
          byte b= 20;
          char c ='a';
          short s =1024;
          int i =5600;
          float f =40.03f;
          double d =12.30d;
          double result= (b*c) + + (i/f)+ - (d-s);
          System.out.println((b*c)+" "+ (i/f)+" "+(d-s));
          System.out.println(result);



    }
}
