package BasicQuestion;

public class CountNUM {
    public static void main(String[] args) {
        int n= 11111111;

        int count = 0;
        while(n > 0){
            int rem = n% 10;
            if(rem == 1){
                count++;

            }
            n = n/10;
        }
        System.out.println(count);
    }
}
