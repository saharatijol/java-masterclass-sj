package codingbatexercise.array1;

public class FirstLast6 {
    public static void main(String[] args) {
        /* Given an array of ints, return true if 6 appears as either the first or last element in the array.
           The array will be length 1 or more.
                firstLast6([1, 2, 6]) → true
                firstLast6([6, 1, 2, 3]) → true
                firstLast6([13, 6, 1, 2, 3]) → false
        * */
        int[] num1 = {1, 2, 6};
        int[] num2 = {6, 1, 2, 3};
        int[] num3 = {13, 6, 1, 2, 3};
        System.out.println(firstLast6(num1));
        System.out.println(firstLast6(num2));
        System.out.println(firstLast6(num3));
    }

    private static boolean firstLast6(int[] nums) {
        boolean isSix = false;

        if(nums[0] == 6 || nums[nums.length - 1] == 6) {
            isSix = true;
        }
        return isSix;
    }
}
