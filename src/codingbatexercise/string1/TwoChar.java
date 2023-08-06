package codingbatexercise.string1;

public class TwoChar {
    public static void main(String[] args) {
        /* Given a string and an index, return a string length 2 starting at the given index.
           If the index is too big or too small to define a string length 2, use the first 2 chars.
           The string length will be at least 2.
            twoChar("java", 0) → "ja"
            twoChar("java", 2) → "va"
            twoChar("java", 3) → "ja"
        * */
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
    }

    private static String twoChar(String str, int index) {
        if(index < 0 || index > str.length()) {
            return str.substring(0,2);
        }

         String appliedIndex = str.substring(index);
         if(appliedIndex.length() < 2) {
             return str.substring(0,2);
         } else {
             return appliedIndex.substring(0,2);
         }
    }
}
