import java.util.Arrays;

public class twoDARRAY {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 9},
                {7, 8, 9}

        };
        int target=8;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[col][row]== target){
                    return new int[]  {row,col};

                }

            }

        }
        return null;
    }
}