package codingbatexercise.array1;

import java.util.Arrays;

public class MakeEnds {
    public static void main(String[] args) {
        /* Given an array of ints,
           return a new array length 2 containing the first and last elements from the original array.
           The original array will be length 1 or more.
                makeEnds([1, 2, 3]) → [1, 3]
                makeEnds([1, 2, 3, 4]) → [1, 4]
                makeEnds([7, 4, 6, 2]) → [7, 2]
        * */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {7, 4, 6, 2};
        System.out.println(Arrays.toString(makeEnds(arr1)));
        System.out.println(Arrays.toString(makeEnds(arr2)));
        System.out.println(Arrays.toString(makeEnds(arr3)));
    }

    private static int[] makeEnds(int[] nums) {

        int[] firstLast = new int[2];
        firstLast[0] = nums[0];
        firstLast[1] = nums[nums.length - 1];

        return firstLast;
    }
}
