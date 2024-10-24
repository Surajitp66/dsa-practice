package linearSearch;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,66,101};
        int target = 66;
        int index = linearSearch(arr, target);
        System.out.println(index);
    }

    // Function to perform linear search in an array and return the index
    static int linearSearch(int[] arr , int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1; // target not found in array
    }
    // Function to perform linear search in an array and return the element
    static int linearSearch2(int[] arr , int target) {
        for ( int element : arr){
            if (element == target)
                return element;
        }

        return Integer.MIN_VALUE; // target not found in array
    }

    // Function to perform linear search in an array and return true or false
    static boolean linearSearch3(int[] arr , int target) {
        for ( int element : arr){
            if (element == target)
                return true;
        }

        return false; // target not found in array
    }
}