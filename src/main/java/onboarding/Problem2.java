package onboarding;

public class Problem2 {

    public static String solution(String cryptogram) {

    }

    public boolean lengthZeroOrOne(String testObject) {
        return testObject.length() == 0 || testObject.length() == 1;
    }

    static boolean validCheck(String testObject) {
        return testObject.matches("(^[a-z]*$)");
    }

}
