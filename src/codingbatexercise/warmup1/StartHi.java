package codingbatexercise.warmup1;

public class StartHi {
    public static void main(String[] args) {
        /*Given a string, return true if the string starts with "hi" and false otherwise.
            startHi("hi there") → true
            startHi("hi") → true
            startHi("hello hi") → false
        * */
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
        System.out.println(startHi("h"));
    }

    public static boolean startHi(String str) {
        boolean isHi = false;
        if(str.startsWith("hi")) {
            isHi = true;
        }
        return isHi;
    }
}
