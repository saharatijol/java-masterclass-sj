package codingbatexercise.array1;

import java.util.Arrays;

public class MaxEnd3 {
    public static void main(String[] args) {
        /* Given an array of ints length 3, figure out which is larger,
           the first or last element in the array,
           and set all the other elements to be that value.
           Return the changed array.
                maxEnd3([1, 2, 3]) → [3, 3, 3]
                maxEnd3([11, 5, 9]) → [11, 11, 11]
                maxEnd3([2, 11, 3]) → [3, 3, 3]
        * */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {11, 5, 9};
        int[] arr3 = {2, 11, 3};
        System.out.println(Arrays.toString(maxEnd3(arr1)));
        System.out.println(Arrays.toString(maxEnd3(arr2)));
        System.out.println(Arrays.toString(maxEnd3(arr3)));
    }

    private static int[] maxEnd3(int[] nums) {
        if(nums[0] < nums[2]) {
            nums[0] = nums[2];
            nums[1] = nums[2];
            return nums;
        }

        if(nums[2] < nums[0]) {
            nums[1] = nums[0];
            nums[2] = nums[0];
            return nums;
        }

        if(nums[0] == nums[2]) {
            nums[1] = nums[2];
            return nums;
        }

        return nums;
    }
}
