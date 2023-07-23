package exercises;

public class GettingStarted {

    public static void main(String[] args) {
        /*
            Write a program that compares two numbers. Use any comparison operator
            Create 3 variables.
            2 variables to store both numbers and 1 variable store the result
            Print the result
        */
        int x = 8;
        int y = 8;
        boolean result = x > y;
        System.out.println(result);

        /*
            Write a program that compares two String contents.
            Create 3 variables.
            2 to store both strings and 1 to store the result
            Print the result
        */
        String word = "peanut";
        String word1 = "butter";
        boolean areSame = word1.equalsIgnoreCase(word);
        System.out.println(areSame);

        // Write a program that transform "Amigoscode" to "AMIGOSCODE"
        String amigoscode = "Amigoscode";
        System.out.println(amigoscode.toUpperCase());

        /*
            Write a program that compares two numbers. i.e x > y
            Create 3 variables.
            2 to store both numbers and 1 to store the result
            Print the result
        */
        int a = 10;
        int b = 18;
        boolean result1 = a >= b;
        System.out.println(result1);

    }
}
