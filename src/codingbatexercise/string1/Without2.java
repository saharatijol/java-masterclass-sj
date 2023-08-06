package codingbatexercise.string1;

public class Without2 {
    public static void main(String[] args) {
        /* Given a string, if a length 2 substring appears at both its beginning and end,
           return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
           The substring may overlap with itself, so "Hi" yields "".
           Otherwise, return the original string unchanged.
                without2("HelloHe") → "lloHe"
                without2("HelloHi") → "HelloHi"
                without2("Hi") → ""
        * */
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
    }

    private static String without2(String str) {
        String result = str;
        if(str.length() < 2){
            return result;
        }

        if(str.length() == 2) {
            result =  "";
        } else if(str.substring(0,2).equals(str.substring(str.length() - 2, str.length()))) {
            result = str.substring(2);
        } else {
            result = str;
        }
        return result;
    }
}
