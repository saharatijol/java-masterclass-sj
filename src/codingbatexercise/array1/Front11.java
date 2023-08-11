package codingbatexercise.array1;

import java.util.Arrays;

public class Front11 {
    public static void main(String[] args) {
        /* Given 2 int arrays, a and b, of any length,
           return a new array with the first element of each array.
           If either array is length 0, ignore that array.
                front11([1, 2, 3], [7, 9, 8]) → [1, 7]
                front11([1], [2]) → [1, 2]
                front11([1, 7], []) → [1]
        * */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 9, 8};
        int[] arr3 = {1};
        int[] arr4 = {2};
        int[] arr5 = {1, 7};
        int[] arr6 = {};
        System.out.println(Arrays.toString(front11(arr1, arr2)));
        System.out.println(Arrays.toString(front11(arr3, arr4)));
        System.out.println(Arrays.toString(front11(arr5, arr6)));
    }

    private static int[] front11(int[] a, int[] b) {
        int[] firstElem = new int[2];

        if(a.length == 0 && b.length == 0) {
            return new int[0];
        }

        if(a.length == 0) {
            int[] oneElem = new int[1];
            oneElem[0] = b[0];
            return oneElem;
        }

        if(b.length == 0) {
            int[] oneElem = new int[1];
            oneElem[0] = a[0];
            return oneElem;
        }

        if(a.length > 0 && b.length > 0) {
            firstElem[0] = a[0];
            firstElem[1] = b[0];
        }


        return firstElem;
    }
}
