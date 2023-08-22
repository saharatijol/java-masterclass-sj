package codewars.eighthkyu;

public class SheepCounter {
    public static void main(String[] args) {
        /**
         * Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
         *
         * For example,
         *
         * [true,  true,  true,  false,
         *   true,  true,  true,  true ,
         *   true,  false, true,  false,
         *   true,  false, false, true ,
         *   true,  true,  true,  true ,
         *   false, false, true,  true]
         *
         * */
        boolean[] sheeps = {true,  true,  true,  false,
                            true,  true,  true,  true ,
                            true,  false, true,  false,
                            true,  false, false, true ,
                            true,  true,  true,  true ,
                            false, false, true,  true };
        System.out.println(countSheeps(sheeps)); // output: 17
    }

    private static int countSheeps(boolean[] arrayOfSheeps) {
        int count = 0;

        for(int i = 0; i < arrayOfSheeps.length; i++) {
            if(arrayOfSheeps[i] == true) {
                count++;
            }
        }

        return count;
    }
}
