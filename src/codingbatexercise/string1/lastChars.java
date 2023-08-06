package codingbatexercise.string1;

public class lastChars {
    public static void main(String[] args) {
        /* Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
           so "yo" and "java" yields "ya".
           If either string is length 0, use '@' for its missing char.
                lastChars("last", "chars") → "ls"
                lastChars("yo", "java") → "ya"
                lastChars("hi", "") → "h@"
        *
        * */
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }

    private static String lastChars(String a, String b) {
        String buildStr = a + b;
        if(a.length() == 0) {
            a = "@";
        }

        if(b.length() == 0) {
            b = "@";
        }

        if(a.length() > 0 && b.length() > 0) {
            buildStr = a.substring(0,1) + b.substring(b.length() - 1, b.length());
        }
        return buildStr;

    }
}
