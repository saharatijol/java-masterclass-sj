package codingbatexercise.string1;

public class AtFirst {
    public static void main(String[] args) {
        /* Given a string, return a string length 2 made of its first 2 chars.
           If the string length is less than 2, use '@' for the missing chars.
                atFirst("hello") → "he"
                atFirst("hi") → "hi"
                atFirst("h") → "h@"
        * */
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
    }

    private static String atFirst(String str) {
        if(str.length() == 0) {
            return "@@";
        }

        if(str.length() < 2) {
            return str + "@";
        }

        if(str.length() == 2) {
            return str;
        } else {
            return str.substring(0,2);
        }
    }
}
