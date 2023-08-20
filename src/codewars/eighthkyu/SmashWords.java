package codewars.eighthkyu;

public class SmashWords {
    public static void main(String[] args) {
        /**
         *  Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
         *  You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
         *  Be careful, there shouldn't be a space at the beginning or the end of the sentence!
         *
         *  ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
         * */
        String[] words = {"hello", "world", "this", "is", "great"};
        System.out.println(smash(words));
    }

    private static String smash(String[] words) {
        String smashedWords = "";

        if(words.length == 0) {
            return smashedWords;
        }

        for(String word : words) {
            smashedWords += word + " ";
        }

        return smashedWords.trim();
    }
}
