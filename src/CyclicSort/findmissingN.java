package CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class findmissingN {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        while(i<nums.length) {
            int j = i+1;
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums , i ,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ans.add(index+1);

            }
        }
        return ans;

    }
     static void swap(int[] arr, int first, int end) {
        int temp = arr[first];
        arr[first ]=arr[end];
        arr[end]=temp;
    }
    }

