package codingbatexercise.logic1;

public class More20 {
    public static void main(String[] args) {
        /* Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
           See also: Introduction to Mod
            more20(20) → false
            more20(21) → true
            more20(22) → true
        * */
        System.out.println(more20(20));
        System.out.println(more20(21));
        System.out.println(more20(22));
    }

    private static boolean more20(int n) {
        boolean isMulitple20 = n % 20 == 1 || n % 20 == 2;
        return isMulitple20;
    }
}
