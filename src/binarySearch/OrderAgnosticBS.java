package binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-55,-7,0,4,6,7,9,23,45,67,77,89};
        int[] arr2 = {490,126,70,65,50,45,23,19,9,0,-4};
        int target = -4;
        int index = findIndex(arr2, target);
        System.out.println(index);
    }

    private static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = (arr[start] < arr[end]);
        while(start <= end){
            int middle = start +(end - start)/2;// is same as (start+end)/2  --->
            // using this because integer range may exited when we add (start+ end)
            if(target == arr[middle]){
                return middle;
            }
            if(isAsc){
                if (target < arr[middle] ){
                    end = middle - 1;
                }else {
                    start = middle + 1;
                }
            }else {
                if (target > arr[middle] ){
                    end = middle - 1;
                }else {
                    start = middle + 1;
                }

            }
        }
        return -1;
    }
}
