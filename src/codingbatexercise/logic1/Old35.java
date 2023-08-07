package codingbatexercise.logic1;

public class Old35 {
    public static void main(String[] args) {
        /* Return true if the given non-negative number is a multiple of 3 or 5, but not both.
           Use the % "mod" operator -- see Introduction to Mod
                old35(3) → true
                old35(10) → true
                old35(15) → false
        * */
        System.out.println(old35(3));
        System.out.println(old35(10));
        System.out.println(old35(15));
    }

    private static boolean old35(int n) {
        if(n % 3 == 0 && n % 5 == 0) {
            return false;
        } else if (n % 3 == 0 || n % 5 == 0){
            return true;
        } else {
            return false;
        }
    }

}
