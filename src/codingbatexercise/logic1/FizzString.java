package codingbatexercise.logic1;

public class FizzString {
    public static void main(String[] args) {
        /* Given a string str, if the string starts with "f" return "Fizz".
           If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
           In all other cases, return the string unchanged. (See also: FizzBuzz Code)
                fizzString("fig") → "Fizz"
                fizzString("dib") → "Buzz"
                fizzString("fib") → "FizzBuzz"
        * */
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }

    private static String fizzString(String str) {
        String fizzBuzz = "";
        if(str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            fizzBuzz = "FizzBuzz";
        } else if(str.charAt(str.length() - 1) == 'b') {
            fizzBuzz = "Buzz";
        } else if(str.charAt(0) == 'f') {
            fizzBuzz = "Fizz";
        } else {
            fizzBuzz = str;
        }

        return fizzBuzz;
    }
}
