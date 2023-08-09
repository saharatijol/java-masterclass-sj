package codingbatexercise.array1;

public class Start1 {
    public static void main(String[] args) {
        /* Start with 2 int arrays, a and b, of any length.
           Return how many of the arrays have 1 as their first element.
            start1([1, 2, 3], [1, 3]) → 2
            start1([7, 2, 3], [1]) → 1
            start1([1, 2], []) → 1
        * */
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 3};
        int[] nums3 = {7, 2, 3};
        int[] nums4 = {1};
        int[] nums5 = {1, 2};
        int[] nums6 = {};
        System.out.println(start1(nums1, nums2));
        System.out.println(start1(nums3, nums4));
        System.out.println(start1(nums5, nums6));
    }

    private static int start1(int[] a, int[] b) {
        int count = 0;

        if(a.length > 0 && a[0] == 1) {
            count++;
        }

        if(b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }
}
