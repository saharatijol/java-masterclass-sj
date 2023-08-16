package udemyexercise.in28minutes;

public class NumberUtils {
    public static void main(String[] args) {
        /* Coding Exercise: Find Last Digit Of A Number
            In this problem, you are tasked with completing the implementation of a NumberUtils class in Java
            that retrieves the last digit of a given integer.
            The last digit of an integer n is the rightmost digit of the integer.
            For instance, the last digit of 2345 is 5, and the last digit of 90 is 0.
            If the input number is 0, return 0 as the last digit of 0 is 0.
            If the input number is negative, return -1 as the last digit of negative numbers will not be considered in this problem.
            Your task is to implement the getLastDigit(int number) method in the NumberUtils class.
              getLastDigit(int number) -
                 This method will take one parameter, number (an integer),
                 and it should retrieve the last digit of this number.
                 If the input number is negative, it should return -1.
        * */
        System.out.println(getLastDigit(1234));   // Output: 4
        System.out.println(getLastDigit(90));     // Output: 0
        System.out.println(getLastDigit(9));      // Output: 9
        System.out.println(getLastDigit(0));      // Output: 0
        System.out.println(getLastDigit(-67));    // Output: -1
    }

    private static int getLastDigit(int number) {
        int lastDigit = 0;

        if(number < 0) {
            return -1;
        }

        for (int i = 0; i < number; i++) {
            lastDigit = number % 10;
        }

        return lastDigit;
    }
}
