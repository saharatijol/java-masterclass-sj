package exercises;

public class Conditionals {

    public static void main(String[] args) {
        // Exercise 1
        // create an integer variable
        // create a second integer variable
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        int num = 11;
        int num2 = 11;
        if(num == num2) {
            System.out.println("they are equal");
        }

        // Exercise 2
        // create a string variable
        // create a second string variable which has the same value as the first
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        String str = "hello";
        String str2 = "hello";
        if(str == str2) {
            System.out.println("they are the same");
        }

        // Exercise 3
        // create a string variable using the `new` keyword
        // create a second string variable which has the same value as the first, again using the `new` keyword
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        String myString = new String("Hello!");
        String myString2 = new String("Hello!");
        if(myString.equals(myString2)) {
            System.out.println("they are the same");
        }

        // Exercise 4
        // create two `int` variables. Assign them values
        // create an `if` statement which compares whether one value is greater than the other
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met
        int val = 10;
        int val2 = 2;
        int val3 = 11;
        if(val > val2 && val < val3) {
            System.out.println("value 1 is greater than value 2");
        } else {
            System.out.println("value 2 is greater than value 1");
        }

        // Exercise 5
        // create three `int` variables. Assign them values with the first value sitting between the other two
        // create an `if` statement which compares whether the first value is greater than the second AND less than the third
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met

        // Exercise 7
        // create a String variable and assign it a value
        // create an `if` statement which grabs the first letter of your word and compares it against a Character value
        // print something to the console if the condition is met
        String a = "muffin man";
        char character = 'n';
        if(a.charAt(0) == character || a.charAt(0) == character) {
            System.out.println("a variable starts with letter");
        }

        // Exercise 8
        // create a String variable and assign it a value
        // create a `for` loop which wraps around your answer from Question 7
        // modify your `if` statement to check the character at each index
        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
        // print something to the console if the condition is met
        String b = "Do you know the muffin man?";

        for(int i = 0; i < b.length(); i++) {
            char charToUpper = Character.toUpperCase(b.charAt(i));
            char upperGivenChar = Character.toUpperCase(character);
            if(charToUpper == upperGivenChar) {
                System.out.println("found the character at index: " + i);
            }
        }

        // Exercise 9
        // create a for loop which goes from 0 to 20
        // print each even value
        for(int i = 0; i <= 20; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
