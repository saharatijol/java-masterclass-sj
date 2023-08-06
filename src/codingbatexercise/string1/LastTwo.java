package codingbatexercise.string1;

public class LastTwo {
    public static void main(String[] args) {
        /* Given a string of any length, return a new string where the last 2 chars,
           if present, are swapped, so "coding" yields "codign".
            lastTwo("coding") → "codign"
            lastTwo("cat") → "cta"
            lastTwo("ab") → "ba
            lastTwo("a") → "a"
            lastTwo("") → ""
        * */
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
        System.out.println(lastTwo("a"));
        System.out.println(lastTwo(""));
    }

    private static String lastTwo(String str) {
        String swapChar = "";
        if(str.length() == 0) {
            return swapChar;
        }

        if(str.length() == 1) {
            return str;
        }

        if(str.length() >= 2) {
            String lastChar = str.substring(str.length() - 1, str.length());
            String secondLastChar = str.substring(str.length() - 2, str.length() - 1);
            swapChar = str.substring(0, str.length() - 2) + lastChar + secondLastChar;
        }
        return swapChar;
    }
}
