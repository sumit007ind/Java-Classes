package BInarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[ ] arr= {2,3,4,5,6,7,45,67,78,89,99};
        int[] arr= {90,89,78,67,56,45,34};
        int target = 34;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static  int  OrderAgnosticBS(int[] arr, int target){
      int start =0;
      int end = arr.length-1;
      boolean isAscending ;
      if(arr[start]<arr[end]){
          isAscending = true;
        }else{
          isAscending = false;
        }
       while(start <=end){
           int mid = start +(end -start)/2;
           if(arr[mid]== target){
               return mid;
           }
           if(isAscending){
               if(target <arr[mid]){
                   end = mid-1;
               } else  {
                   start = mid+1;
               }
           }else {
               if(target >arr[mid]){
                   end = mid-1;
               } else  {
                   start = mid+1;
               }
           }

       }
       return -1;
    }

}
