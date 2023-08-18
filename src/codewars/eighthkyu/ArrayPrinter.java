package codewars.eighthkyu;

public class ArrayPrinter {
    public static void main(String[] args) {
        /** Input: Array of elements
         *         ["h","o","l","a"]
         *
         *  Output: String with comma delimited elements of the array in th same order.
         *         "h,o,l,a"
         * */
        String[] hola = {"h", "o", "l", "a"};
        System.out.println(printArray(hola));
    }

    private static String printArray(Object[] array) {
        String delimit = "";

        for(int i = 0; i < array.length; i++) {
            delimit += array[i] + ",";
        }

        delimit = delimit.substring(0, delimit.length() - 1);
        return delimit;
    }
}
