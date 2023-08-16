package udemyexercise.in28minutes;

public class NumberOfDigits {

    public static void main(String[] args) {
        /**
         * This method calculates and returns the number of digits in a given integer.
         * If the number is negative, it returns -1.
         * If the number is zero, it returns 1 as zero is considered to have one digit.
         * @param number: an integer
         * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
         */
        System.out.println(getNumberOfDigits(12345)); // Output: 5
        System.out.println(getNumberOfDigits(90));    // Output: 2
        System.out.println(getNumberOfDigits(9));     // Output: 1
        System.out.println(getNumberOfDigits(0));     // Output: 1
        System.out.println(getNumberOfDigits(-67));   // Output: -1
    }

    private static int getNumberOfDigits(int number) {
        int countDigit = 0;

        if(number < 0) {
            return -1;
        }

        if(number == 0) {
            return 1;
        }

        while(number > 0) {
            number = number / 10;
            countDigit++;
        }

        return countDigit;
    }

}
