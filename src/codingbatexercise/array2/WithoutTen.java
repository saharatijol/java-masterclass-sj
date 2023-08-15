package codingbatexercise.array2;

import java.util.Arrays;

public class WithoutTen {
    public static void main(String[] args) {
        /* Return a version of the given array where all the 10's have been removed.
           The remaining elements should shift left towards the start of the array as needed,
           and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
           You may modify and return the given array or make a new array.
                withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
                withoutTen([10, 2, 10]) → [2, 0, 0]
                withoutTen([1, 99, 10]) → [1, 99, 0]
        */
        int[] arr1 = {1, 10, 10, 2};
        int[] arr2 = {10, 2, 10};
        int[] arr3 = {1, 99, 10};
        System.out.println(Arrays.toString(withoutTen(arr1)));
        System.out.println(Arrays.toString(withoutTen(arr2)));
        System.out.println(Arrays.toString(withoutTen(arr3)));
    }

    private static int[] withoutTen(int[] nums) {

        int[] noTens = new int[nums.length];
        int resultIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 10) {
                noTens[resultIndex] = nums[i];
                resultIndex++;
            }
        }
        return noTens;
    }
}
