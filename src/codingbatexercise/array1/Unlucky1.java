package codingbatexercise.array1;

import java.util.Arrays;

public class Unlucky1 {
    public static void main(String[] args) {
        /* We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
           Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
                unlucky1([1, 3, 4, 5]) → true
                unlucky1([2, 1, 3, 4, 5]) → true
                unlucky1([1, 1, 1]) → false
        * */
        int[] nums1 = {1, 3, 4, 5};
        int[] nums2 = {2, 1, 3, 4, 5};
        int[] nums3 = {1, 1, 1};
        System.out.println(unlucky(nums1));
        System.out.println(unlucky(nums2));
        System.out.println(unlucky(nums3));
    }

    private static boolean unlucky(int[] nums) {
        boolean isUnlucky = false;
        if(nums.length < 2) {
            return false;
        }

        if(nums[0] == 1 && nums[1] == 3
            || nums[1] == 1 && nums[2] == 3
             || nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
            isUnlucky = true;
        }

        return isUnlucky;
    }
}
