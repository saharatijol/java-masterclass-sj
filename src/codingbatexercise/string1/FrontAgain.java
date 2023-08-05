package codingbatexercise.string1;

public class FrontAgain {
    public static void main(String[] args) {
        /* Given a string, return true if the first 2 chars in the string also appear at the end of the string,
           such as with "edited".
            frontAgain("edited") → true
            frontAgain("edit") → false
            frontAgain("ed") → true
        * */
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }

    private static boolean frontAgain(String str) {
        boolean same2chars = false;
        if(str.length() <= 1) {
            return same2chars;
        }

        if(str.substring(0,2).equals(str.substring(str.length() - 2, str.length()))
           || (str.length() < 3)) {
            same2chars =  true;
        }

        return same2chars;
    }
}
