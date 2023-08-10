package codingbatexercise.array1;

public class MaxTriple {
    public static void main(String[] args) {
        /* Given an array of ints of odd length, look at the first, last, and middle values in the array
           and return the largest. The array length will be a least 1.
                maxTriple([1, 2, 3]) → 3
                maxTriple([1, 5, 3]) → 5
                maxTriple([5, 2, 3]) → 5
        * */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 5, 3};
        int[] arr3 = {5, 2, 3};
        System.out.println(maxTriple(arr1));
        System.out.println(maxTriple(arr2));
        System.out.println(maxTriple(arr3));
    }

    private static int maxTriple(int[] nums) {
        int largest = 0;

        int firstIndex = nums[0];
        int getMiddle = nums.length / 2;
        int middleIndex = nums[getMiddle];
        int lastIndex = nums[nums.length - 1];
        System.out.println("This is middle index " + middleIndex);

        if(firstIndex > middleIndex && firstIndex > lastIndex) {
            largest = firstIndex;
        } else if (middleIndex > firstIndex && middleIndex > lastIndex) {
            largest = middleIndex;
        } else {
            largest = lastIndex;
        }
        return largest;
    }
}
