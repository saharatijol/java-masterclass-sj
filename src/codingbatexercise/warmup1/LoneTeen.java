package codingbatexercise.warmup1;

public class LoneTeen {
    public static void main(String[] args) {
        /* We'll say that a number is "teen" if it is in the range 13..19 inclusive.
           Given 2 int values, return true if one or the other is teen, but not both.
            loneTeen(13, 99) → true
            loneTeen(21, 19) → true
            loneTeen(13, 13) → false
        * */

        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
    }

    private static boolean loneTeen(int a, int b) {
        boolean isTeen = false;

        if((a >= 13 && a <= 19) && ((b >= 13 && b <= 19))
            || (a > 19 && b > 19)) {
            isTeen = false;
        } else {
            isTeen = true;
        }
        return isTeen;
    }
}
