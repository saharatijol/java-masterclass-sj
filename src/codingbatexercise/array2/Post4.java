package codingbatexercise.array2;

import java.util.Arrays;

public class Post4 {
    public static void main(String[] args) {
        /**
         *  Given a non-empty array of ints, return a new array containing the elements from the original array
         *  that come after the last 4 in the original array. The original array will contain at least one 4.
         *  Note that it is valid in java to create an array of length 0.
         * post4([2, 4, 1, 2]) → [1, 2]
         * post4([4, 1, 4, 2]) → [2]
         * post4([4, 4, 1, 2, 3]) → [1, 2, 3]
         * */
        int[] arr1 = {2, 4, 1, 2};
        int[] arr2 = {4, 1, 4, 2};
        int[] arr3 = {4, 4, 1, 2, 3};
        System.out.println(Arrays.toString(post4(arr1)));
        System.out.println(Arrays.toString(post4(arr2)));
        System.out.println(Arrays.toString(post4(arr3)));
    }

    private static int[] post4(int[] nums) {
        // TODO: YOU NEED TO REVIEW THIS SOLUTION, RINSE AND REPEAT!!!!
        int lastIndex = -1;
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == 4) {
                lastIndex = i;
                break;
            }
        }

        int[] result = new int[nums.length - lastIndex - 1];
        int index = 0;
        for(int i = lastIndex + 1; i < nums.length; i++) {
            result[index] = nums[i];
            index++;
        }

        return result;
    }
}
