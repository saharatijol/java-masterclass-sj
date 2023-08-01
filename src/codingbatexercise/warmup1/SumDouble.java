package codingbatexercise.warmup1;

public class SumDouble {
    public static void main(String[] args) {
        /* Given two int values, return their sum.
           Unless the two values are the same, then return double their sum.
                sumDouble(1, 2) → 3
                sumDouble(3, 2) → 5
                sumDouble(2, 2) → 8
        * */
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
    }

    private static int sumDouble(int a, int b) {
        int result =  a + b;
        if(a == b) {
           result = result * 2;
        }
        return result;
    }
}
