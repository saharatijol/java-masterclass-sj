package codingbatexercise.array2;

public class Sum28 {
    public static void main(String[] args) {
        /* Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
            sum28([2, 3, 2, 2, 4, 2]) → true
            sum28([2, 3, 2, 2, 4, 2, 2]) → false
            sum28([1, 2, 3, 4]) → false * */
        int[] arr1 = {2, 3, 2, 2, 4, 2};
        int[] arr2 = {2, 3, 2, 2, 4, 2, 2};
        int[] arr3 = {1, 2, 3, 4};
        System.out.println(sum28(arr1));
        System.out.println(sum28(arr2));
        System.out.println(sum28(arr3));
    }

    private static boolean sum28(int[] nums) {
        boolean isEight = false;
        int sum = 0;
        for(int num : nums) {
            if(num == 2) {
                sum += num;
            }
        }

        if(sum == 8) {
            isEight = true;
        }
        return isEight;
    }

}
