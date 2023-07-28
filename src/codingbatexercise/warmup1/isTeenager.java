package codingbatexercise.warmup1;

public class isTeenager {

    public static void main(String[] args) {
        /* We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
            hasTeen(13, 20, 10) → true
            hasTeen(20, 19, 10) → true
            hasTeen(20, 10, 13) → true
        * */
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));
    }

    private static boolean hasTeen(int a, int b, int c) {
        boolean result = false;

        if(a >= 13 && a < 20
                || b >= 13 && b < 20
                || c >= 13 && c < 20) {
            result = true;
        }

        return result;
    }
}
