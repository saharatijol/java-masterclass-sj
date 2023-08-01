package codingbatexercise.string1;

public class FirstHalf {

    public static void main(String[] args) {
        /* Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
            firstHalf("WooHoo") → "Woo"
            firstHalf("HelloThere") → "Hello"
            firstHalf("abcdef") → "abc"
        * */
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }

    private static String firstHalf(String str) {
        String halfString = str.substring(0, str.length() / 2);
        return halfString;
    }
}
