package codewars.eighthkyu;

public class NeedleInHaystack {
    public static void main(String[] args) {
        /**
         * Can you find the needle in the haystack?
         * Write a function findNeedle() that takes an array full of junk but containing one "needle"
         * After your function finds the needle it should return a message (as a string) that says:
         *     "found the needle at position " plus the index it found the needle, so:
         *Example(Input --> Output)
         * ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
         * */
        String[] arr = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        String[] arr2 = {"283497238987234", "a dog", "a cat", null, "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        System.out.println(findNeedle(arr));
        System.out.println(findNeedle(arr2));
    }

    private static String findNeedle(String[] haystack) {
        String message = "found the needle at position ";

        for(int i = 0; i < haystack.length; i++) {
            if(haystack[i] == null) {
                continue;
            }

            if(haystack[i].equals("needle")) {
                message += i;
            }
        }
        return message;
    }
}
