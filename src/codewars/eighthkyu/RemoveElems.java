package codewars.eighthkyu;

import java.util.Arrays;

public class RemoveElems {
    public static void main(String[] args) {
        /** Take an array and remove every second element from the array.
         *  Always keep the first element and start removing with the next element.
            Example:
            ["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]

            None of the arrays will be empty, so you don't have to worry about that!
         * */
        String[] arr = {"Keep", "Remove", "Keep", "Remove", "Keep"};
        System.out.println(Arrays.toString(removeElems(arr))); // should return  ["Keep", "Keep", "Keep"]



    }

    private static Object[] removeElems(Object[] arr) {
        Object[] newArr = new Object[(arr.length + 1) / 2];
        int newIndex = 0;

        for(int i = 0; i < arr.length; i+=2) {
            newArr[newIndex] = arr[i];
            newIndex++;
        }

        return newArr;
    }
}
