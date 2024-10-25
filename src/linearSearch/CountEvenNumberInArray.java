package linearSearch;

import java.util.Scanner;

public class CountEvenNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums= {12,345,2,6,7896,9, -76};
        System.out.println("Number of even digits in the array: " + findNumbers(nums));
    }

    private static int findNumbers(int[] numbers) {
        int evenNumberCount = 0;
        for(int element : numbers) {
//            int noOfDigits= countDigits(element);
            if (element <0){
                element = element * -1;
            }

            if (((int)Math.log10(element)+1) % 2 == 0){
                evenNumberCount++;
            }
        }
        return evenNumberCount;
    }

    private static int countDigits(int element) {
        if(element == 0)
            return 1;  // Base case: if number is 0, it has 1 digit.
        if (element <0)
            element = element * -1;
        int count = 0;
        while (element != 0){
            count++;
            element = element /10;
        }
        return count;
    }
}
