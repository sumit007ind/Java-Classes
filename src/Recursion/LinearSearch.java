package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
    int[ ] arr = {1,23,4,5,66,7};
    int target = 66;
        System.out.println(Find(arr ,66,0));
    }
    static boolean  Find(int[] arr ,int target ,int index) {
        if(index== arr.length) {
            return false;
        }
        return arr[index] == target || Find(arr,target,index+1);


    }

}
