package codingbatexercise.logic1;

public class SortaSum {
    public static void main(String[] args) {
        /* Given 2 ints, a and b, return their sum.
           However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
                sortaSum(3, 4) → 7
                sortaSum(9, 4) → 20
                sortaSum(10, 11) → 21
        * */
        System.out.println(sortaSum(3, 4));
        System.out.println(sortaSum(9, 4));
        System.out.println(sortaSum(10, 11));
    }

    private static int sortaSum(int a, int b) {
        int sum = a + b;

        if(sum >= 10 && sum <= 19) {
            sum = 20;
        }

        return sum;
    }
}
