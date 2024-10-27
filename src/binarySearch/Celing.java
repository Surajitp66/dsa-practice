package binarySearch;

public class Celing {
    public static void main(String[] args) {
        // ciling = smallest element in array greater or equal to the target element
        int[] arr = { 2,5,12, 15, 18, 22, 30};
        int[] arr2 = {490,126,70,65,50,45,23,19,9,0,-4};
        int target = 23;
        int index = findCiling(arr, target);
        System.out.println(index);
    }

    private static int findCiling(int[] arr, int target) {
        int start =0;
        int end = arr.length -1;
        boolean isAsc = (arr[start] < arr[end]);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (isAsc) {
                if(target < arr[mid]){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return  (isAsc)? ((start > arr.length-1)? -1 : arr[start] ): ((end <0)? -1 : arr[end]);
    }
}
