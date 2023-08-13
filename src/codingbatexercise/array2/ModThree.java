package codingbatexercise.array2;

public class ModThree {
    public static void main(String[] args) {
        /* Given an array of ints, return true
           if the array contains either 3 even or 3 odd values all next to each other.
                modThree([2, 1, 3, 5]) → true
                modThree([2, 1, 2, 5]) → false
                modThree([2, 4, 2, 5]) → true
        * */
        int[] arr1 = {2, 1, 3, 5};
        int[] arr2 = {2, 1, 2, 5};
        int[] arr3 = {2, 4, 2, 5};
        int[] arr4 = {1, 2};
        System.out.println(modThree(arr1));
        System.out.println(modThree(arr2));
        System.out.println(modThree(arr3));
        System.out.println(modThree(arr4));
    }

    private static boolean modThree(int[] nums) {
        boolean isOddOrEven = false;

        for(int i = 0; i <= nums.length - 3; i++) {
           int current = nums[i];
           int next = nums[i + 1];
           int third = nums[i + 2];
            if(current % 2 == 0 && next % 2 == 0 && third % 2 == 0
               || current % 2 != 0 && next % 2 != 0 && third % 2 != 0) {
               isOddOrEven = true;
           }

        }

        return isOddOrEven;
    }
}
