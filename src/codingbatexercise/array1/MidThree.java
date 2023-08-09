package codingbatexercise.array1;

import java.util.Arrays;

public class MidThree {
    public static void main(String[] args) {
        /* Given an array of ints of odd length,
            return a new array length 3 containing the elements from the middle of the array.
            The array length will be at least 3.
                midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
                midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
                midThree([1, 2, 3]) → [1, 2, 3]
        * */
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {8, 6, 7, 5, 3, 0, 9};
        int[] nums3 = {1, 2, 3};
        System.out.println(Arrays.toString(midThree(nums1)));
        System.out.println(Arrays.toString(midThree(nums2)));
        System.out.println(Arrays.toString(midThree(nums3)));
    }

    private static int[] midThree(int[] nums) {
        int[] midArr = new int[3];
        if(nums.length == 3) {
            return nums;
        }

        int middleThree = (nums.length / 2) - 1;
        midArr[0] = nums[middleThree];
        midArr[1] = nums[middleThree + 1];
        midArr[2] = nums[middleThree + 2];

        return midArr;
    }
}
