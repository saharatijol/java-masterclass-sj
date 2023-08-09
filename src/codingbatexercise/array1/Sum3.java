package codingbatexercise.array1;

public class Sum3 {
    public static void main(String[] args) {
        /* Given an array of ints length 3, return the sum of all the elements.
            sum3([1, 2, 3]) → 6
            sum3([5, 11, 2]) → 18
            sum3([7, 0, 0]) → 7
        * */
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {5, 11, 2};
        int[] nums3 = {7, 0, 0};
        System.out.println(sum3(nums1));
        System.out.println(sum3(nums2));
        System.out.println(sum3(nums3));
    }

    private static int sum3(int[] nums) {

        return nums[0] + nums[1] + nums[2];
    }
}
