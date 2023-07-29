package codingbatexercise.warmup1;

public class FrontBack {

    public static void main(String[] args) {
        /* Given a string, return a new string where the first and last chars have been exchanged.
            frontBack("code") → "eodc"
            frontBack("a") → "a"
            frontBack("ab") → "ba" */
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    private static String frontBack(String str) {
       String frontBack = "";
        if (str.length() <= 1) {
            return str;
        } else {
            String firstChar = str.substring(0,1);
            String lastChar = str.substring(str.length() - 1, str.length());
            String middle = str.substring(1, str.length() - 1);
            frontBack = lastChar + middle + firstChar;
        }

        return frontBack;
    }
}
