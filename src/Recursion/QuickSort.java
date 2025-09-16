package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 4, 8, 7, 9};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {   // ✅ Correct base case
            return;
        }

        int s = left;
        int e = right;
        int m = s + (right - left) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {   // ✅ compare values, not indices
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // Recursive calls
        quickSort(arr, left, e);
        quickSort(arr, s, right);
    }
}
