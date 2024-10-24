package linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 66, 101};
        int target = 66;
        int start = 2;
        int end = 5;
        int index = linearSearch(arr,target, start, end );
        System.out.println(index);
    }

    static int linearSearch(int[] arr , int target, int start, int end) {

        for (int i = start; i <= end; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1; // target not found in array
    }
}
