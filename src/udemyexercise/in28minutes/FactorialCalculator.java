package udemyexercise.in28minutes;

public class FactorialCalculator {
    public static void main(String[] args) {
        /* In this problem, you are tasked with completing the implementation of a FactorialCalculator class in Java
           that calculates the factorial of a given number.
           The factorial of a non-negative integer n, denoted by n!,
           is the product of all positive integers less than or equal to n.
           The factorial function can be defined by the product:
                n! = n * (n-1) * (n-2) * ... * 3 * 2 * 1
            For example,
                4! = 4 * 3 * 2 * 1 = 24
                3! = 3 * 2 * 1 = 6
                2! = 2 * 1 = 2
                1! = 1
                0! is defined to be 1
            If the input is negative, return -1 as the factorial for negative numbers is undefined.

            Your task is to implement the calculateFactorial(int number) method in the FactorialCalculator class.
            calculateFactorial(int number) - This method will take one parameter, number (an integer),
            and it should calculate the factorial of this number.
            If the input number is negative, it should return -1.
        * */
        System.out.println(calculateFactorial(5));    // Output: 120
        System.out.println(calculateFactorial(4));    // Output: 24
        System.out.println(calculateFactorial(3));    // Output: 6
        System.out.println(calculateFactorial(2));    // Output: 2
        System.out.println(calculateFactorial(1));    // Output: 1
        System.out.println(calculateFactorial(0));    // Output: 1
        System.out.println(calculateFactorial(-5));   // Output: -1
    }

    private static int calculateFactorial(int number) {
        int factorial = 1;

        if(number < 0) {
            return -1;
        }

        for(int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
