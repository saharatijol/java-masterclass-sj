package codingbatexercise.string1;

public class MiddleTwo {
    public static void main(String[] args) {
        /* Given a string of even length, return a string made of the middle two chars,
           so the string "string" yields "ri". The string length will be at least 2.
                middleTwo("string") → "ri"
                middleTwo("code") → "od"
                middleTwo("Practice") → "ct"
        * */
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }

    private static String middleTwo(String str) {
        String firstHalf = str.substring(0, str.length() / 2);
        String secondHalf = str.substring(str.length() / 2, str.length());

        String lastChar = firstHalf.substring(firstHalf.length() - 1, firstHalf.length());
        String firstChar = secondHalf.substring(0,1);
        return lastChar + firstChar;
    }
}
