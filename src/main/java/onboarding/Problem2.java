package onboarding;

public class Problem2 {

    private static final String EXCEPTION = "예외 발생";
    private static final String A_TO_Z = "(^[a-z]*$)";
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 1000;

    public static String solution(String cryptogram) {
        if (!validCheck(cryptogram)) {
            return EXCEPTION;
        } else {
            if (lengthZeroOrOne(cryptogram)) {
                return cryptogram;
            }
            return sameStringDelete(cryptogram);
        }
    }

    static String sameStringDelete(String testObject) {
        while (true) {
            boolean sameString = false;
            for (int i = 0; i < testObject.length() - 1; i++) {
                if (testObject.charAt(i) == testObject.charAt(i + 1)) {
                    testObject = testObject.substring(0, i) + testObject.substring(i + 2);
                    sameString = true;
                }
            }
            if (!sameString) {
                break;
            }

        }
        return testObject;
    }

    static boolean lengthZeroOrOne(String testObject) {
        return testObject.length() == 0 || testObject.length() == 1;
    }

    static boolean validCheck(String testObject) {
        return testObject.matches(A_TO_Z) && MIN_RANGE <= testObject.length() && testObject.length() <= MAX_RANGE;
    }

}
