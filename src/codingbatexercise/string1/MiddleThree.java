package codingbatexercise.string1;

public class MiddleThree {
    public static void main(String[] args) {
        /* Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
           The string length will be at least 3.
            middleThree("Candy") → "and"
            middleThree("and") → "and"
            middleThree("solving") → "lvi"
        * */
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }

    private static String middleThree(String str) {
        int middle = str.length() / 2;
        String middleLetters = str.substring(middle - 1, middle + 2);
        return middleLetters;
    }
}
