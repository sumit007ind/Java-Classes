package BInarySearch;

import java.util.Arrays;

public class RowColmatrix {
    public static void main(String[] args) {
  int[][] arr = {
          {1,2,3,4},
          {5,6,7,8},
          {9,10,11,10}
  };
        System.out.println(Arrays.toString(searchmatrix(arr, 9 )));
    }
    static  int[] searchmatrix(int[][] matrix ,int target){
        int row = 0;
        int col= matrix.length-1;
        while(row < matrix.length  && col >= 0){
          if(matrix[row][col] == target){
              return new int[]{row,col};
          }
           if(matrix[row][col] > target){
               col--;

            }else {
               row++;
           }
        }
        return new int[]{-1,-1};
    }


}
