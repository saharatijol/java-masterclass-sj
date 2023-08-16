package codingbatexercise.array2;

public class Only14 {
    public static void main(String[] args) {
        /* Given an array of ints, return true if every element is a 1 or a 4.
            only14([1, 4, 1, 4]) → true
            only14([1, 4, 2, 4]) → false
            only14([1, 1]) → true
        * */
        int[] arr1 = {1, 4, 1, 4};
        int[] arr2 = {1, 4, 2, 4};
        int[] arr3 = {1, 1};
        System.out.println(only14(arr1));
        System.out.println(only14(arr2));
        System.out.println(only14(arr3));
    }

    private static boolean only14(int[] nums) {
        boolean hasFourOrOne = true;

        for(int num : nums) {
            if(num != 4 && num != 1) {
                hasFourOrOne = false;
            }
        }

        return hasFourOrOne;

    }
}
