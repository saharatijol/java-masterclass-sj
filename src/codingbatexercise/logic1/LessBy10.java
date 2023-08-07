package codingbatexercise.logic1;

public class LessBy10 {
    public static void main(String[] args) {
        /* Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
                lessBy10(1, 7, 11) → true
                lessBy10(1, 7, 10) → false
                lessBy10(11, 1, 7) → true
        * */
        System.out.println(lessBy10(1, 7, 11));
        System.out.println(lessBy10(1, 7, 10));
        System.out.println(lessBy10(11, 1, 7));
    }

    private static boolean lessBy10(int a, int b, int c) {
        if(Math.abs(a - c) >= 10
                || Math.abs(a - b) >= 10
                || Math.abs(b - c) >= 10) {
            return true;
        } else {
            return false;
        }
    }
}
