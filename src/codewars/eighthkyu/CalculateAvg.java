package codewars.eighthkyu;

public class CalculateAvg {
    public static void main(String[] args) {
        /**
         * Write a function which calculates the average of the numbers in a given list.
         *
         * Note: Empty arrays should return 0.
         * */
        int[] arr = {2, 3, 2, 2, 4, 2}; // output: 2.5
        System.out.println(findAverage(arr));
    }

    private static double findAverage(int[] array) {
        double sum = 0;

        if(array.length == 0) {
            return 0;
        }

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / array.length;
        return average;
    }
}
