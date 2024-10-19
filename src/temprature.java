import java.util.Scanner;

public class temprature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in degrees Celsius: ");
        float tempC = in.nextFloat();
        float temF = (tempC* 9/5) + 32;
        System.out.println(temF);

    }
}
