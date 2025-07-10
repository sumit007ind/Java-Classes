package BubbleSort;

import java.util.Arrays;

public class SimpleBubbleSort {
    public static void main(String[] args) {
int[] arr={2,3,1,0,2,4};
bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for (int i=0; i < arr.length; i++) {
            for (int j=1; j<arr.length-1; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
