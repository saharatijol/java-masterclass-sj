package codingbatexercise.array1;

import java.util.Arrays;

public class MiddleWay {
    public static void main(String[] args) {
        /* Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
            middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
            middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
            middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
        * */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 7, 7};
        int[] arr4 = {3, 8, 0};
        int[] arr5 = {5, 2, 9};
        int[] arr6 = {1, 4, 5};
        System.out.println(Arrays.toString(middleWay(arr1, arr2)));
        System.out.println(Arrays.toString(middleWay(arr3, arr4)));
        System.out.println(Arrays.toString(middleWay(arr5, arr6)));
    }

    private static int[] middleWay(int[] a, int[] b) {
        int[] middleElem = new int[2];
        middleElem[0] = a[1];
        middleElem[1] = b[1];
        return middleElem;
    }
}
