package udemyexercise.in28minutes;

public class ReverseNumber {
    public static void main(String[] args) {
        /**
         * This method reverses a given integer and returns the reversed number.
         * If the number is negative, it returns -1 as the reverse of a negative number is undefined.
         * If the number is zero, it returns 0 as the reverse of 0 is 0.
         * @param number: an integer
         * @return reversed number, or -1 if number is negative, or 0 if number is zero.
         */
        System.out.println(reverseNumber(123)); // Output: 321
        System.out.println(reverseNumber(5497));    // Output: 7945
        System.out.println(reverseNumber(-456)); // Output: -1
    }

    private static int reverseNumber(int number) {
        int reversedNum = 0;

        if(number < 0) {
            return -1;
        }

        if(number == 0) {
            return 0;
        }

       // redo this one

        return reversedNum;
    }
}
