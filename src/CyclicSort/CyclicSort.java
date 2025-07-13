package CyclicSort;


import java.util.Arrays;

import static java.util.Collections.sort;
import static java.util.Collections.swap;

public class CyclicSort {
    public static void main(String[] args) {
   int[] arr = {3,5,2,4,1,6,7,8,9};
   CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CyclicSort(int[] arr) {
        int i = 0;

        while(i<arr.length) {
            int j = i+1;
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr , i ,correct);
            }else{
                i++;
            }


        }
        
    }
    private static void swap(int[] arr, int first, int end) {
        int temp = arr[first];
        arr[first ]=arr[end];
        arr[end]=temp;
    }
}
