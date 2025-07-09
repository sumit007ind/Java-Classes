package BInarySearch;

public class SortedMatrix {
    public static void main(String[] args) {

    }
    static int[] binarySearch(int[][] matrix,int row ,int cstart , int cend , int target){
        while(cstart<=cend){
            int mid = cstart + (cend-cstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }if(matrix[row][mid]<target){
                cstart = mid+1;
            }else {
                cend = mid = 1;
            }
        }
        return null;

    }
    static int[] Search(int[][] matrix ,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1 ,target);
        }
        int rstart=0;
        int rend =rows-1;
        int cmid =cols/2;

        while
        ()
    }
}
