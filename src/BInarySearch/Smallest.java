package BInarySearch;

public class Smallest {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        public  static void main(String[] args) {
            int[ ] arr= {2,3,5,9,14,16,18};
            int target = 4;
            int ans = Ceiling(arr, target);
            System.out.println(ans);
        }

        static int Ceiling(int[] arr, int target){
            if(target>arr[arr.length-1]){
                return -1;
            }
            int start = 0;
            int end = arr.length-1;
            while(start <=end){
                int mid = start +(end-start)/2;
                if(target < arr[mid]){
                    end =mid-1;
                } else if (target>arr[mid]) {
                    start=mid+1;
                }else{
                   and=mid
                   if(findstartindex == true){
                       end = mid-1;
                   }else{
                       start = mid+1;
                   }
                }


            }
            return end;
        }
    }

}
