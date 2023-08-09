package codingbatexercise.array1;

import java.util.Arrays;

public class Reverse3 {
    public static void main(String[] args) {
        /* Given an array of ints length 3, return a new array with the elements in reverse order,
            so {1, 2, 3} becomes {3, 2, 1}.
                reverse3([1, 2, 3]) → [3, 2, 1]
                reverse3([5, 11, 9]) → [9, 11, 5]
                reverse3([7, 0, 0]) → [0, 0, 7]
        * */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {5, 11, 9};
        int[] arr3 = {7, 0, 0};
        System.out.println(Arrays.toString(reverse3(arr1)));
        System.out.println(Arrays.toString(reverse3(arr2)));
        System.out.println(Arrays.toString(reverse3(arr3)));
    }

    private static int[] reverse3(int[] arr) {
        int[] copyArr = new int[arr.length];

        copyArr[0] = arr[2];
        copyArr[1] = arr[1];
        copyArr[2] = arr[0];

        return copyArr;
    }
}
