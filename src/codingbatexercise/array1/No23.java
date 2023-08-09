package codingbatexercise.array1;

import java.util.Arrays;

public class No23 {
    public static void main(String[] args) {
        /* Given an int array length 2, return true if it does not contain a 2 or 3.
               no23([4, 5]) → true
               no23([4, 2]) → false
               no23([3, 5]) → false
        * */
        int[] arr1 = {4, 5};
        int[] arr2 = {4, 2};
        int[] arr3 = {3, 5};
        System.out.println(no23(arr1));
        System.out.println(no23(arr2));
        System.out.println(no23(arr3));
    }

    private static boolean no23(int[] arr) {
        boolean is2Or3 = true;
        if(arr[0] == 2 || arr[1] == 2 || arr[0] == 3 || arr[1] == 3) {
            is2Or3 = false;
        }

        return is2Or3;
    }
}
