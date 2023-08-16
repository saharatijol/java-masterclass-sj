package codingbatexercise.array2;

public class No14 {
    public static void main(String[] args) {
        /* Given an array of ints, return true if it contains no 1's or it contains no 4's.
                no14([1, 2, 3]) → true
                no14([1, 2, 3, 4]) → false
                no14([2, 3, 4]) → true
        * */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {2, 3, 4};
        System.out.println(no14(arr1));
        System.out.println(no14(arr2));
        System.out.println(no14(arr3));
    }

    private static boolean no14(int[] nums) {
        boolean hasNo14 = false;
        boolean hasNo1 = true;
        boolean hasNo4 = true;

        for(int num : nums) {
            if(num == 1) {
                hasNo1 = false;
            }

            if(num == 4) {
                hasNo4 = false;
            }
        }

        if(hasNo1 || hasNo4){
            hasNo14 = true;
        }

        return hasNo14;
    }
}
