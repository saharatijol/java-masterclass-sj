package codingbatexercise.array2;

public class Lucky13 {
    public static void main(String[] args) {
        /* Given an array of ints, return true if the array contains no 1's and no 3's.
            lucky13([0, 2, 4]) → true
            lucky13([1, 2, 3]) → false
            lucky13([1, 2, 4]) → false
        * */
        int[] arr1 = {0, 2, 4};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        System.out.println(lucky13(arr1));
        System.out.println(lucky13(arr2));
        System.out.println(lucky13(arr3));
    }

    private static boolean lucky13(int[] nums) {

       for(int i = 0; i < nums.length; i++) {
           if(nums[i] == 1 || nums[i] == 3) {
               return false;
           }
       }
       return true;
    }
}
