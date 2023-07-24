package exercises;

import java.util.Arrays;

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
        char letter = 'n';
        if(a.charAt(0) == letter || a.charAt(0) == letter) {
            System.out.println("a variable starts with letter");
        }

        // Exercise 8
        // create a String variable and assign it a value
        // create a `for` loop which wraps around your answer from Question 7
        // modify your `if` statement to check the character at each index
        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
        // print something to the console if the condition is met
        String b = "Do you know the muffin man?";
        char character = 'n';

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

        // Arrays and Conditionals Exercises
        // Exercise 1
        /* Write a method that reverses any String and print to console
            Input should be a string
            Output should be reversed input */
        System.out.println(reversed("amigoscode"));

        // Exercise 2
        /* Given the following String input
           String input = "   amig os cod e  "
           Write a method that transforms input into: Amigoscode */
        String input = "   amig os cod e  ";
        //System.out.println(transformString(input));

        // Exercise 3
        /*  Write a method that finds the longest string in any given array.
            i.e. [] -> ""
            i.e. ["hello", "ola", "bye", "ciao"] -> hello
            i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
            i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
        */
        String[] words = {"hello", "bingo", "ola", "bye", "ciao", "booya"};
        System.out.println(findLongestString(words));

    }

    // Exercise 1 method
    static String reversed(String input) {
        String[] inputArr = input.split("");
        String word = "";
        for(int i = inputArr.length - 1; i >= 0; i--) {
            word += inputArr[i];
        }
        return word;
    }

    // Exercise 2 method
    static String transformString(String input) {
        String[] stringToArr = input.split(" ");
        String result = "";

        for(int i = 0; i < stringToArr.length; i++) {
            result += stringToArr[i];
        }
        String capitalizeFirst = result.substring(0,1).toUpperCase();
        result = capitalizeFirst + result.substring(1);
        return result;
    }

    // Exercise 3 method
    static String findLongestString(String[] words) {
        String longest = "";
        String result = "";
        for(String word : words) {
            if(word.length() > longest.length()) {
                longest = word;
                result = word;
                continue;
            }
            if(word.length() >= longest.length()) {
                longest = word;
                result += ", " + word;
            }
        }
        return result;
    }
}
