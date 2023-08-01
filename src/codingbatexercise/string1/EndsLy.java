package codingbatexercise.string1;

public class EndsLy {
    public static void main(String[] args) {
        /* Given a string, return true if it ends in "ly".
            endsLy("oddly") → true
            endsLy("y") → false
            endsLy("oddy") → false
        * */
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }

    private static boolean endsLy(String str) {
        boolean endsWithLy = false;
        if(str. length() < 2) {
            return endsWithLy;

        }
        if(str.charAt(str.length() - 1) == 'y'
                && str.charAt(str.length() - 2) == 'l') {
            endsWithLy = true;
        }
        return endsWithLy;
    }
}
