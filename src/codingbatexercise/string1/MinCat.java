package codingbatexercise.string1;

public class MinCat {
    public static void main(String[] args) {
        /* Given two strings, append them together (known as "concatenation") and return the result.
           However, if the strings are different lengths, omit chars from the longer string
           so it is the same length as the shorter string.
           So "Hello" and "Hi" yield "loHi". The strings may be any length.
                minCat("Hello", "Hi") → "loHi"
                minCat("Hello", "java") → "ellojava"
                minCat("java", "Hello") → "javaello"
        * */
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
    }

    private static String minCat(String a, String b){
        String chopChar = "";
        boolean isALonger = a.length() > b.length();
        boolean isBLonger = b.length() > a.length();

        if(a.length() == b.length()) {
            return a + b;
        }

        if(isALonger) {
            chopChar = a.substring(a.length() - b.length()) + b;
        }

        if(isBLonger) {
            chopChar = a + b.substring(b.length() - a.length());
        }
        return chopChar;
    }
}
