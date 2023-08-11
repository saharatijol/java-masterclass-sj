package codingbatexercise.array1;

import java.util.Arrays;

public class SwapEnds {
    public static void main(String[] args) {
        /* Given an array of ints, swap the first and last elements in the array.
           Return the modified array. The array length will be at least 1.
            swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
            swapEnds([1, 2, 3]) → [3, 2, 1]
            swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
        * */
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {8, 6, 7, 9, 5};
        System.out.println(Arrays.toString(swapEnds(arr1)));
        System.out.println(Arrays.toString(swapEnds(arr2)));
        System.out.println(Arrays.toString(swapEnds(arr3)));
    }

    private static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        return nums;
    }
}
