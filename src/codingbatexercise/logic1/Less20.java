package codingbatexercise.logic1;

public class Less20 {
    public static void main(String[] args) {
        /* Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
           So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
                less20(18) → true
                less20(19) → true
                less20(20) → false
                less20(58) → true
                less20(59) → true
                less20(1018) -> true
                less20(1019) → true
        * */
        System.out.println(less20(18));
        System.out.println(less20(19));
        System.out.println(less20(20));
    }

    private static boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }
}
