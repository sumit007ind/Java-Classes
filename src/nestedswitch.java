import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String empName = in.next();

        switch (empID){
            case 1:
                System.out.println("sumit sharma ");

                break;
            case 2:
                System.out.println("raj sharma");
                break;
            case 3:
                System.out.println("sushant sharma ");
                break;
            case 4:
                System.out.println(" harsh sharma ");
                break;
            case 5:
                System.out.println(" shahitya sharma ");
                break;


        }
        switch (empName){
            case"btech":
                System.out.println("3rd year");
                break;

            default:
                System.out.println("nothing else");
                break;
        }

    }
}
