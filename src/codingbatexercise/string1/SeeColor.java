package codingbatexercise.string1;

public class SeeColor {
    public static void main(String[] args) {
        /*Given a string, if the string begins with "red" or "blue" return that color string,
          otherwise return the empty string.
             seeColor("redxx") → "red"
             seeColor("xxred") → ""
             seeColor("blueTimes") → "blue" */
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }

    private static String seeColor(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        } else if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
}
