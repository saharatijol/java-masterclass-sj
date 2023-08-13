package codingbatexercise.array2;

import java.util.Arrays;

public class MatchUp {
    public static void main(String[] args) {
        /* Given arrays nums1 and nums2 of the same length, for every element in nums1,
           consider the corresponding element in nums2 (at the same index).
           Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
                matchUp([1, 2, 3], [2, 3, 10]) → 2
                matchUp([1, 2, 3], [2, 3, 5]) → 3
                matchUp([1, 2, 3], [2, 3, 3]) → 2
        * */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 10};
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {2, 3, 5};
        int[] arr5 = {1, 2, 3};
        int[] arr6 = {2, 3, 3};
        System.out.println(matchUp(arr1, arr2));
        System.out.println(matchUp(arr3, arr4));
        System.out.println(matchUp(arr5, arr6));
    }

    private static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for(int i = 0; i < nums1.length; i++) {
            int calcDiff = Math.abs(nums1[i] - nums2[i]);
            if(calcDiff <= 2 && calcDiff != 0) {
                count++;
            }
        }

        return count;
    }
}
