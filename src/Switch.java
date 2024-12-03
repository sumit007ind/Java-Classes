import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "orange":
                System.out.println("rounded fruit with juicy ");
                break;
            case "angoor":
                System.out.println("angoor");
                break;
            case"apple":
                System.out.println("apple");
                break;
            default:
                System.out.println("please enter a valid fruit"
                );
        }
    }
}
