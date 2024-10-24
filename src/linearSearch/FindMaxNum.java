package linearSearch;

public class FindMaxNum {
    public static void main(String[] args) {
        int[] arr = {1, 34, 55 , 83, 12, 13, 9};
        int max = findMaxNum(arr);
        System.out.println(max);
    }

    private static int findMaxNum(int[] arr) {
        int maxNum = arr[0];
        for (int element : arr) {
            if (element > maxNum) {
                maxNum = element;
            }
        }
        return maxNum;
    }
}
