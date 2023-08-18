package codewars.eighthkyu;

import java.util.Arrays;

public class CountByX {
    public static void main(String[] args) {
        /* Create a function with two arguments that will return an array of the first n multiples of x.
           Assume both the given number and the number of times to count will be positive numbers greater than 0.
           Return the results as an array or list ( depending on language ).
        * */

        System.out.println(Arrays.toString(countBy(1,10))); // should return  {1,2,3,4,5,6,7,8,9,10}
        System.out.println(Arrays.toString(countBy(2,5))); //should return {2,4,6,8,10}
    }

    private static int[] countBy(int x, int n) {

        int[] countArr = new int[n];
        int iter = x * n;
        int startInd = 0;

        for(int i = x; i <= iter; i = i + x) {
            countArr[startInd] = i;
            startInd++;

            String convert = countArr.toString();
            convert.split(",");
        }
        return countArr;
    }
}
