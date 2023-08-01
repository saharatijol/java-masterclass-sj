package codingbatexercise.string1;

public class MakeOutWord {

    public static void main(String[] args) {
        /* Given an "out" string length 4, such as "<<>>", and a word,
           return a new string where the word is in the middle of the out string,
           e.g. "<<word>>".
           Note: use str.substring(i, j) to extract the String starting at index i
           and going up to but not including index j.
                makeOutWord("<<>>", "Yay") → "<<Yay>>"
                makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
                makeOutWord("[[]]", "word") → "[[word]]"
        * */
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }

    private static String makeOutWord(String out, String word) {
        String front = out.substring(0,2);
        String back = out.substring(2,4);
        return front + word + back;
    }
}
