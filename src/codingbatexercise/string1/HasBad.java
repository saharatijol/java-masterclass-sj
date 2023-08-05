package codingbatexercise.string1;

public class HasBad {
    public static void main(String[] args) {
        /* Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
           such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
           Note: use .equals() to compare 2 strings.
                hasBad("badxx") → true
                hasBad("xbadxx") → true
                hasBad("xxbadxx") → false
                hasBad("xba") → false
                hasBad("bad") → true
           */
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
        System.out.println(hasBad("xba"));
        System.out.println(hasBad("bad"));
    }

    private static boolean hasBad(String str) {
        boolean hasBadStr = false;
        if(str.length() < 3 ) {
            return false;
        } else if(str.length() == 3) {
            hasBadStr = str.equals("bad");
        } else if(str.substring(0,3).equals("bad")
                   || str.substring(1,4).equals("bad")) {
            hasBadStr =  true;
        } else {
            hasBadStr = false;
        }

        return hasBadStr;
    }
}
