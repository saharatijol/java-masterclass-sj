package codingbatexercise.array1;

public class SameFirstLast {
    public static void main(String[] args) {
        /* Given an array of ints, return true if the array is length 1 or more,
           and the first element and the last element are equal.
            sameFirstLast([1, 2, 3]) → false
            sameFirstLast([1, 2, 3, 1]) → true
            sameFirstLast([1, 2, 1]) → true
        * */
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 1};
        int[] nums3 = {1, 2, 1};
        System.out.println(sameFirstLast(nums1));
        System.out.println(sameFirstLast(nums2));
        System.out.println(sameFirstLast(nums3));
    }

    private static boolean sameFirstLast(int[] nums) {
        boolean isSame = false;
        if(nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            isSame = true;
        }

        return isSame;
    }
}
