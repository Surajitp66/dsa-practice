package linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {11,42,90,1},
                        {43,55,6},
                        {10,32,112, 14,16}
        };
        int target = 6;
       int[] ans = findNumber(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findNumber(int[][] arr, int target) {
        for ( int row = 0; row < arr.length; row++ ) {
            for ( int col = 0; col < arr[row].length; col++ ) {
                if ( arr[row][col] == target ) {
                    return  new int []{row,col};
                }
            }
        }
        return new int []{-1};
    }
}