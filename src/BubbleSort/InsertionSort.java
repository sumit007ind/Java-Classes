package BubbleSort;


import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={12,34,2,1,23,45};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }else {
                    break;
                }
            }

        }
    }
}
