package codingbatexercise.array1;

import java.util.Arrays;

public class PlusTwo {
    public static void main(String[] args) {
        /* Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
            plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
            plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
            plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
        * */
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        int[] arr3 = {4, 4};
        int[] arr4 = {2, 2};
        int[] arr5 = {9, 2};
        int[] arr6 = {3, 4};
        System.out.println(Arrays.toString(plusTwo(arr1, arr2)));
        System.out.println(Arrays.toString(plusTwo(arr3, arr4)));
        System.out.println(Arrays.toString(plusTwo(arr5, arr6)));
    }

    private static int[] plusTwo(int[] a, int[] b) {
        int[] together = new int[4];

        together[0] = a[0];
        together[1] = a[1];
        together[2] = b[0];
        together[3] = b[1];

        return together;
    }
}
