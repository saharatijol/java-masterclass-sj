package codingbatexercise.array1;

import java.util.Arrays;

public class MakeMiddle {
    public static void main(String[] args) {
        /* Given an array of ints of even length,
           return a new array length 2 containing the middle two elements from the original array.
           The original array will be length 2 or more.
                makeMiddle([1, 2, 3, 4]) → [2, 3]
                makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
                makeMiddle([1, 2]) → [1, 2]
        * */
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {7, 1, 2, 3, 4, 9};
        int[] nums3 = {1, 2};
        System.out.println(Arrays.toString(makeMiddle(nums1)));
        System.out.println(Arrays.toString(makeMiddle(nums2)));
        System.out.println(Arrays.toString(makeMiddle(nums3)));
    }

    private static int[] makeMiddle(int[] nums) {
        int[] copyArr = new int[2];
        if(nums.length == 2) {
            return nums;
        }

        int middleIndex = nums.length / 2 - 1; // Calculate the index of the first middle element
        copyArr[0] = nums[middleIndex];
        copyArr[1] = nums[middleIndex + 1];

        return copyArr;

    }
}
