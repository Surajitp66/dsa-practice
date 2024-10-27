package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,6,7,9,23,45,67,77,89};
        int target = 770;
        int index = findIndex(arr, target);
        System.out.println(index);
    }

    private static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int middle = start +(end - start)/2;// is same as (start+end)/2  --->
                                                // using this because integer range may exited when we add (start+ end)
             if (target < arr[middle] ){
                end = middle - 1;
            }
            else if (target > arr[middle]){
                start = middle + 1;
            }
            else
                return middle;

        }
        return -1;
    }
}
