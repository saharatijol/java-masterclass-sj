package codingbatexercise.warmup1;

public class ParrotTrouble {

    public static void main(String[] args) {
        /* We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
           We are in trouble if the parrot is talking and the hour is before 7 or after 20.
           Return true if we are in trouble.
                parrotTrouble(true, 6) → true
                parrotTrouble(true, 7) → false
                parrotTrouble(false, 6) → false * */
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }

    private static boolean parrotTrouble(boolean isTalking, int hour) {
        boolean isTrouble = false;

        if(isTalking && hour < 7 || isTalking && hour > 20) {
            isTrouble = true;
        }

        return isTrouble;
    }
}
