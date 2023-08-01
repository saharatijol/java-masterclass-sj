package exercises;

public class Methods {

    public static void main(String[] args) {
        /* Exercise 1: Write a method which takes two numbers as arguments and prints their sum to the terminal.
        * */
        System.out.println("Sum: " + sum(5,5));

        /* Exercise 2: Write a method which takes a number as an argument and returns that number negated,
                       e.g. passing 5 as an argument should return -5; passing -10 should return 10.
        * */
        System.out.println("Negate: " + negate(4));

        /* Exercise 3: Write a method which takes two numbers as arguments,
                      checks if they are the same and returns the appropriate boolean value.

                      You should check both possible outcomes here,
                      i.e. that it returns true when it is supposed to and false when it is supposed to.
        * */
        System.out.println("isSame: " + isSame(25, 27));

        /* Exercise 4: Write a method which takes two numbers as arguments and prints one of:
                            -"The first number is larger"
                            -"The second number is larger"
                            -"The numbers are equal"
                                ..as appropriate.
        * */
        System.out.println("Print Larger method: " + printLarger(11, 5));

        /* Exercise 5: Write a method which takes a string as an argument,
                      capitalizes the first letter and returns the capitalized string.

                        HINT: The .toUpperCase() method will capitalize the whole string.
                              Investigate how to split the first letter from the string,
                              capitalize that, then join the pieces back together
        * */
        System.out.println("Capitalized String: " + capitalizeFirst("amigoscode"));

        /* Exercise 6: Write a method which takes an array of strings as an argument
                       and returns the number of items in the array.*/
        String[] strArray = {"do", "you", "know", "the", "muffin", "man?"};
        System.out.println("Number of items in Array of Strings: " + getArraySize(strArray));

        /* Exercise 7: Write a method which takes a sentence as an argument,
                       counts the number of words in the array
                       and prints "The sentence contains X words".*/
        System.out.println("The sentence contains " + wordCount("Do you know the muffin man?") + " words.");


    }

    // Exercise 1 method
    private static int sum(int a, int b) {
        return a + b;
    }

    // Exercise 2 method
    private static int negate(int a) {
        return -a;
    }

    // Exercise 3 method
    private static boolean isSame(int a, int b) {
        return a == b;
    }

    // Exercise 4 method
    private static String printLarger(int a, int b) {
        String result = "";
        if(b > a) {
            result = "The second number is larger.";
        } else if(a == b) {
            result = "The numbers are equal";
        } else {
            result = "The first number is larger";
        }
        return result;
    }

    // Exercise 5 method
    private static String capitalizeFirst(String str) {
        String firstLetter = str.substring(0,1).toUpperCase();
        String theRest = str.substring(1);
        return firstLetter + theRest;
    }

    // Exercise 6 method
    private static int getArraySize(String[] arrayOfStr) {
        return arrayOfStr.length;
    }

    // Exercise 7 method
    private static int wordCount(String sentence) {
        String[] word = sentence.split(" ");
        return word.length;
    }
}
