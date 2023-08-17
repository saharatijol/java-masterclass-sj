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
        // 123
        // mod 123%10 = 3 -
        // div 123/10 = 12
        // mod 12%10 = 2 -
        // div 12/10 = 1
        // mod 1%10 = 1 -
        // div 1/10 = 0

        // look at the mods,
        // 3 * 10 = 30
        // 30 + 2 = 32
        // 32 * 10 = 320
        // 320 + 1 = 321
        int divide = 0;
        int mod = 0;
        int reversed = 0;

        while(number > 0) {
           int digit = number % 10; // 1
           reversed = reversed * 10 + digit; // 0 * 10 = 0; 0 + 3 = 3 // 2nd iter 3 * 10 = 30 + 2 = 32// 3rd iter: 32 * 10 = 320 + 1 = 321
           number = number / 10; // 1/10 = 0

        }
        System.out.println("This is mod: " + 1 % 10);
        System.out.println("This is divide: " + 1 / 10);


        return reversedNum;
    }
}
