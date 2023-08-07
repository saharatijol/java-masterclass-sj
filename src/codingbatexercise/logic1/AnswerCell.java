package codingbatexercise.logic1;

public class AnswerCell {
    public static void main(String[] args) {
        /* Your cell phone rings. Return true if you should answer it.
           Normally you answer, except in the morning you only answer if it is your mom calling.
           In all cases, if you are asleep, you do not answer.
                answerCell(false, false, false) → true
                answerCell(false, false, true) → false
                answerCell(true, false, false) → false
                answerCell(true, true, false) → true
                answerCell(false, true, false) → true
                answerCell(true, true, true) → false
        * */
        System.out.println(answerCell(false, false, false));
        System.out.println(answerCell(false, false, true));
        System.out.println(answerCell(true, false, false));
        System.out.println(answerCell(true, true, false));
        System.out.println(answerCell(false, true, false));
        System.out.println(answerCell(true, true, true));

    }

    private static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean answerPhone = false;

        if (isAsleep) {
            return false;
        }

        if (isMorning && isMom) {
            return true;
        }

        if (!isAsleep) {
            if (!isMorning && !isMom || !isMorning && isMom) {
                return true;
            }
        }

        return answerPhone;
    }
}
