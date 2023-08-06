package codingbatexercise.string1;

public class ComboString {
    public static void main(String[] args) {
        /* Given 2 strings, a and b, return a string of the form short+long+short,
           with the shorter string on the outside and the longer string on the inside.
           The strings will not be the same length, but they may be empty (length 0).
                comboString("Hello", "hi") → "hiHellohi"
                comboString("hi", "Hello") → "hiHellohi"
                comboString("aaa", "b") → "baaab"
        * */
        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));
    }

    private static String comboString(String a, String b) {
        boolean isAShorter = a.length() < b.length();
        if(isAShorter) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}
