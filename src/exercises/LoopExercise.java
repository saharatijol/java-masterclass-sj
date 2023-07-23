package exercises;

import java.util.Arrays;

public class LoopExercise {
    public static void main(String[] args) {
        // Exercise 1
        // declare an empty integer array of length = 3
        // print the contents to the console
        int[] emptyArr = new int[3];
        System.out.println(Arrays.toString(emptyArr));

        // Exercise 2 - Continuing from previous exercise
        // fill it with the number `4`
        // print the array to the console
        Arrays.fill(emptyArr, 4);
        System.out.println(Arrays.toString(emptyArr));

        // Exercise 3 - Continuing from previous exercise
        // reassign the second value in the array to the number `17`
        // print the array to the console
        emptyArr[1] = 17;
        System.out.println(Arrays.toString(emptyArr));

        // Exercise 4
        // What happens when you try to re assign index 5 to any integer?
        int[] numbers = {1, 2, 3, 4, 5};
        //numbers[5] = 21; // You get an exception

        // Exercise 5
        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        // print the array to the console
        String[] someLetters = new String[4];
        someLetters[0] = "a";
        someLetters[1] = "b";
        someLetters[2] = "c";
        someLetters[3] = "d";
        System.out.println(Arrays.toString(someLetters));

        // Exercise 6
        // using your answer from Q5 above, create a second array which is initialized using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare
        String[] copySomeLetters = someLetters;
        copySomeLetters[0] = "z";
        System.out.println("copySomeLettersArray = " + Arrays.toString(copySomeLetters));
        System.out.println("someLettersArray = " + Arrays.toString(someLetters));

        // Exercise 7
        // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare
        String[] copyOfOrig = Arrays.copyOf(someLetters, 5);
        copyOfOrig[0] = "c";
        System.out.println("someLettersArray = " + Arrays.toString(someLetters));
        System.out.println("copyOfOrig = " + Arrays.toString(copyOfOrig));

        // create a `for` loop which prints each item in the array
        String[] a = {"a", "b", "c", "d"};
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        // Exercise 8
        // create a for loop which goes from 0 to 10
        // print each value
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        // Exercise 9
        // create a for loop which goes from 10 down to 0
        // print each value
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        // Exercise 10
        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array
        int[] numbers1to10 = new int[11];
        for(int i = 0; i < numbers1to10.length; i++) {
            numbers1to10[i] = i;
            //System.out.println(numbers1to10[i]);
        }
        System.out.println("numbers1to10 = " + Arrays.toString(numbers1to10));

        // Exercise 11
        // create an array of n numbers
        // create a sum variable
        // create a loop
        // add each item to the sum value
        // outside the loop print the total sum
        int[] n = {1, 2, 3, 4, 5}; // 15
        int sum = 0;
        for(int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        System.out.println("sum of array = " + sum);
    }
}
