package codingbatexercise.logic1;

public class ShareDigit {
    public static void main(String[] args) {
        /* Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
           such as the 2 in 12 and 23.
           (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
                shareDigit(12, 23) → true
                shareDigit(12, 43) → false
                shareDigit(12, 44) → false
        * */
        System.out.println(shareDigit(12, 23));
        System.out.println(shareDigit(12, 43));
        System.out.println(shareDigit(12, 44));
    }

    private static boolean shareDigit(int a, int b) {
        boolean isDigitExist = false;
        int leftADigit = Math.abs(a / 10);
        int rightDigitA = Math.abs(a % 10);

        int leftDigitB = Math.abs(b / 10);
        int rightDigitB = Math.abs(b % 10);

        if(rightDigitA == leftDigitB
           || leftADigit == rightDigitB
            || rightDigitA == rightDigitB) {
            isDigitExist =  true;
        }

        return isDigitExist;
    }
}
