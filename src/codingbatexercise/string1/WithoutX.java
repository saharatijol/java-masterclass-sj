package codingbatexercise.string1;

public class WithoutX {
    public static void main(String[] args) {
        /* Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
           and otherwise return the string unchanged.
                withoutX("xHix") → "Hi"
                withoutX("xHi") → "Hi"
                withoutX("Hxix") → "Hxi"
        * */
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
        System.out.println(withoutX("xx"));
        System.out.println(withoutX("x"));
    }

    private static String withoutX(String str) {

        if (str.length() == 0) {
            return str;
        }

        if (str.length() == 1) {
            return str.equals("x") ? "" : str;
        }

        if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
            return str.substring(1, str.length() - 1);

        } else if (str.charAt(0) == 'x') {
            return str.substring(1);

        } else if (str.charAt(str.length() - 1) == 'x') {
            return str.substring(0, str.length() - 1);

        } else {
            return str;
        }
    }
}
