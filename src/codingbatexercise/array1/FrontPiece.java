package codingbatexercise.array1;

import java.util.Arrays;

public class FrontPiece {
    public static void main(String[] args) {
        /* Given an int array of any length, return a new array of its first 2 elements.
           If the array is smaller than length 2, use whatever elements are present.
                frontPiece([1, 2, 3]) → [1, 2]
                frontPiece([1, 2]) → [1, 2]
                frontPiece([1]) → [1]
        * */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {1};
        System.out.println(Arrays.toString(frontPiece(arr1)));
        System.out.println(Arrays.toString(frontPiece(arr2)));
        System.out.println(Arrays.toString(frontPiece(arr3)));
    }

    private static int[] frontPiece(int[] nums) {
        int[] firstTwo = new int[2];
        if(nums.length < 2) {
            return nums;
        }

        firstTwo[0] = nums[0];
        firstTwo[1] = nums[1];
        return firstTwo;
    }
}
