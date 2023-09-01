package codingbatexercise.string2;

public class DoubleChar {
    public static void main(String[] args) {
        /**
         *  Given a string, return a string where for every char in the original, there are two chars.
         *
         * doubleChar("The") → "TThhee"
         * doubleChar("AAbb") → "AAAAbbbb"
         * doubleChar("Hi-There") → "HHii--TThheerree"
         * */
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("Aabb"));
        System.out.println(doubleChar("Hi-There"));
    }

    private static String doubleChar(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += result + str.charAt(i);
        }

        return result;
    }
}
