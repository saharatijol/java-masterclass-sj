package codingbatexercise.warmup1;

public class BackAround {
    public static void main(String[] args) {
        /* Given a string, take the last char and return a new string with the last char added at the front and back
           , so "cat" yields "tcatt". The original string will be length 1 or more.
                backAround("cat") → "tcatt"
                backAround("Hello") → "oHelloo"
                backAround("a") → "aaa" * */
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }

    public static String backAround(String str) {
        String grabLetter = str.substring(str.length() - 1, str.length());
        String buildStr = grabLetter + str + grabLetter;
        return buildStr;
    }
}
