package codingbatexercise.string1;

public class ExtraEnd {
    public static void main(String[] args) {
        /* Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
           The string length will be at least 2.
                extraEnd("Hello") → "lololo"
                extraEnd("ab") → "ababab"
                extraEnd("Hi") → "HiHiHi"*/
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }

    private static String extraEnd(String str) {

        if(str.length() == 2) {
            return str + str + str;
        } else {
            String ends = str.substring(str.length() - 2, str.length());
            return ends + ends + ends;
        }
    }
}
