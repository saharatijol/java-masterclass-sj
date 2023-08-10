package codingbatexercise.array1;

import java.util.Arrays;

public class Make2 {
    public static void main(String[] args) {
        /* Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
           the elements from a followed by the elements from b. The arrays may be any length, including 0,
           but there will be 2 or more elements available between the 2 arrays.
                make2([4, 5], [1, 2, 3]) → [4, 5]
                make2([4], [1, 2, 3]) → [4, 1]
                make2([], [1, 2]) → [1, 2]
        * */
        int[] arr1 = {4, 5};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4};
        int[] arr4 = {1, 2, 3};
        int[] arr5 = {};
        int[] arr6 = {1, 2};
        System.out.println(Arrays.toString(make2(arr1, arr2)));
        System.out.println(Arrays.toString(make2(arr3, arr4)));
        System.out.println(Arrays.toString(make2(arr5, arr6)));
    }

    private static int[] make2(int[] a, int[] b) {
        int[] newArr = new int[2];

        if(a.length == 0 && b.length > 0) {
            newArr[0] = b[0];
            newArr[1] = b[1];
        }

        if(b.length == 0 && a.length > 0) {
            newArr[0] = a[0];
            newArr[1] = a[1];
        }

        if(a.length > 0 && b.length > 0) {
            newArr[0] = a[0];
            newArr[1] = b[0];
            if(a.length >= 2) {
                newArr[1] = a[1];
            }
        }

        return newArr;
    }
}
