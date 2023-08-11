package codingbatexercise.array2;

public class Sum13 {
    public static void main(String[] args) {
        /* Return the sum of the numbers in the array, returning 0 for an empty array.
           Except the number 13 is very unlucky,
           so it does not count and numbers that come immediately after a 13 also do not count.
                sum13([1, 2, 2, 1]) → 6
                sum13([1, 1]) → 2
                sum13([1, 2, 2, 1, 13]) → 6
        * */
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {1, 1};
        int[] arr3 = {1, 2, 2, 1, 13};
        System.out.println(sum13(arr1));
        System.out.println(sum13(arr2));
        System.out.println(sum13(arr3));
    }

    private static int sum13(int[] nums) {
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 13) {
                sum += nums[i];
            } else {
                i++;
            }
        }

        return sum;
    }
}
