package onboarding;

public class Problem2 {

    public static String solution(String cryptogram) {
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
