package Recursion;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
int [ ] arr = {3,4,2,3,1,34,4};
arr= Mergesort(arr);
System.out.println(Arrays.toString(arr));

    }
    static int[] Mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = Mergesort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = Mergesort(Arrays.copyOfRange(arr, mid, arr.length));
  return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right){
        int [] mix = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k++] = left[i++];
            } else {
                mix[k++] = right[j++];
            }
        }

        while(i < left.length){
            mix[k++] = left[i++];
        }

        while(j < right.length){
            mix[k++] = right[j++];
        }

        return mix;
    }

}

