package codewars.eighthkyu;

import java.util.Arrays;

public class MonkeyCount {
    public static void main(String[] args) {
        /**
         *  You take your son to the forest to see the monkeys. You know that there are a certain number there (n),
         *  but your son is too young to just appreciate the full number, he has to start counting them from 1.
         *  As a good parent, you will sit and count with him. Given the number (n), populate an array
         *  with all numbers up to and including that number, but excluding zero.
         *
         *  For example (input ---> output)
         *  10 --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
         *  1 --> [1]
         * */
        System.out.println(Arrays.toString(monkeyCount(10)));
        System.out.println(Arrays.toString(monkeyCount(1)));
    }

    private static int[] monkeyCount(final int n) {
        int[] count = new int[n];
        int index = 0;

        for(int i = 1; i <= n; i++) {
            count[index] = i;
            index++;
        }

        return count;
    }
}
