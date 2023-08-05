package codingbatexercise.string1;

public class NTwice {
    public static void main(String[] args) {
        /* Given a string and an int n, return a string made of the first and last n chars from the string.
           The string length will be at least n.
                nTwice("Hello", 2) → "Helo"
                nTwice("Chocolate", 3) → "Choate"
                nTwice("Chocolate", 1) → "Ce"
        * */
        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
    }

    private static String nTwice(String str, int n) {
        String firstNChars = str.substring(0,n);
        String lastNChars = str.substring(str.length() - n);
        return firstNChars + lastNChars;
    }
}
