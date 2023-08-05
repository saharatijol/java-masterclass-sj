package codingbatexercise.string1;

public class ConcatEx {
    public static void main(String[] args) {
        /* Given two strings, append them together (known as "concatenation") and return the result.
           However, if the concatenation creates a double-char,
           then omit one of the chars, so "abc" and "cat" yields "abcat".
            conCat("abc", "cat") → "abcat"
            conCat("dog", "cat") → "dogcat"
            conCat("abc", "") → "abc"
        * */
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
    }

    private static String conCat(String a, String b) {
        String conCatStr = a + b;
        if (a.length() < 1 || b.length() < 1) {
            return conCatStr;
        }

        if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) {
            conCatStr = a.substring(0, a.length() - 1) + b;
        }
        return conCatStr;
    }

}

