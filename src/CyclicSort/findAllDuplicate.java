package CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicate {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int j = i + 1;
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
            List<Integer> ans = new ArrayList<Integer>();
            for (int index = 0; index < arr.length; index++) {
                if(arr[index] != index+1){
                    ans.add(arr[index]);

                }
            }
            return ans;
        }
        return null;
    }
    static void swap(int[] arr, int first, int end) {
        int temp = arr[first];
        arr[first ]=arr[end];
        arr[end]=temp;
    }

    }


