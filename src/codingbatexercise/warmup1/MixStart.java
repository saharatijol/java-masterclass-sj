package codingbatexercise.warmup1;

public class MixStart {

    public static void main(String[] args) {
        /* Return true if the given string begins with "mix",
            except the 'm' can be anything, so "pix", "9ix" .. all count.
                mixStart("mix snacks") → true
                mixStart("pix snacks") → true
                mixStart("piz snacks") → false
        * */
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }

    private static boolean mixStart(String str) {
        boolean result = false;
        if(str.length() < 2) {
            result = false;
        } else {
            String two = str.substring(1,3);
            if(two.equals("ix")) {
                result = true;
            }
        }
        return result;
    }
}
