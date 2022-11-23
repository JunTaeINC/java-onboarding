package onboarding;

public class Problem2 {

    public static String solution(String cryptogram) {
        if (!validCheck(cryptogram)) {
            return "예외 발생";
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
        if (testObject.matches("(^[a-z]*$)") && 0 < testObject.length() && testObject.length() < 1001) {
            return true;
        }
        return false;
    }

}
