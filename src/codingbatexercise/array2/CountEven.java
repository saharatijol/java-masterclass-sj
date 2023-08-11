package codingbatexercise.array2;

public class CountEven {
    public static void main(String[] args) {
        /* Return the number of even ints in the given array.
           Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
                countEvens([2, 1, 2, 3, 4]) → 3
                countEvens([2, 2, 0]) → 3
                countEvens([1, 3, 5]) → 0
        * */
        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};
        System.out.println(countEvens(arr1));
        System.out.println(countEvens(arr2));
        System.out.println(countEvens(arr3));
    }

    private static int countEvens(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
