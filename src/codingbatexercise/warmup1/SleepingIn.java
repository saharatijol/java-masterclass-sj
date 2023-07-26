package codingbatexercise.warmup1;

public class SleepingIn {
    public static void main(String[] args) {
        /*
        * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
            sleepIn(false, false) → true
            sleepIn(true, false) → false
            sleepIn(false, true) → true
        * */
        System.out.println(sleepIn(false,false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        boolean result = false;
        if(!weekday || vacation) {
            result = true;
        }
        return result;
    }
}
