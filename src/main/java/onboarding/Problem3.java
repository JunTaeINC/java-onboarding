package onboarding;

public class Problem3 {
    private final static char THREE = '3';
    private final static char SIX = '6';
    private final static char NINE = '9';

    public static int solution(int number) {
        return checkingNumber(number);
    }

    static int checkingNumber(int testNumber) {
        int count = 0;

        for (int number = 0; number <= testNumber; number++) {
            String stringNumber = String.valueOf(number);
            for (int length = 0; length < stringNumber.length(); length++) {
                if (stringNumber.charAt(length) == THREE || stringNumber.charAt(length) == SIX ||
                        stringNumber.charAt(length) == NINE) {
                    count++;
                }
            }
        }
        return count;
    }
}
