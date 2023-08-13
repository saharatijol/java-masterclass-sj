package codingbatexercise.array2;

import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        /* Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
           You may modify and return the given array, or return a new array.
                shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
                shiftLeft([1, 2]) → [2, 1]
                shiftLeft([1]) → [1]
        * */
        int[] arr1 = {6, 2, 5, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {1};
        System.out.println(Arrays.toString(shiftLeft(arr1)));
        System.out.println(Arrays.toString(shiftLeft(arr2)));
        System.out.println(Arrays.toString(shiftLeft(arr3)));
    }

    private static int[] shiftLeft(int[] nums) {
        int[] shifted = new int[nums.length];

        if(nums.length == 0) {
            return new int[0];
        }

        int firstElement = nums[0];
        for(int i = 0; i < nums.length - 1; i++) {
            shifted[i] = nums[i + 1];
        }
        shifted[shifted.length - 1] = firstElement;

        return shifted;
    }
}
