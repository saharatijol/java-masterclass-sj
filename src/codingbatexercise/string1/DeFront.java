package codingbatexercise.string1;

public class DeFront {
    public static void main(String[] args) {
        /* Given a string, return a version without the first 2 chars.
           Except keep the first char if it is 'a' and keep the second char if it is 'b'.
           The string may be any length. Harder than it looks.
                deFront("Hello") → "llo"
                deFront("java") → "va"
                deFront("away") → "aay"
                deFront("axy") → "ay"
                deFront("abc") → "abc"
                deFront("xby") → "by"
                deFront("ab") → "ab"
                deFront("xbc") → "bc"
                deFront("abxyz") → "abxyz"
        * */

        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
        System.out.println(deFront("axy"));
        System.out.println(deFront("abc"));
        System.out.println(deFront("xby"));
        System.out.println(deFront("ab"));
        System.out.println(deFront("xbc"));
        System.out.println(deFront("abxyz"));
    }

    private static String deFront(String str) {
        String result = "";
        if(str.charAt(0) != 'a' || str.charAt(1) != 'b') {
            result = str.substring(2);
        }

        if(str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            result = str;
        }

        if(str.charAt(0) == 'a' && str.charAt(1) != 'b') {
            result = str.substring(0,1) + str.substring(2);
        }

        if(str.charAt(1) == 'b' && str.charAt(0) != 'a') {
           result = str.substring(1);
        }

        return result;
    }
}
