package onboarding;

public class Problem2 {
    private static final String EXCEPTION = "예외 발생";
    public static String solution(String cryptogram) {

    }

    public boolean lengthCheck(String testObject){
        return testObject.length() != 0 && testObject.length() != 1;
    }

    static boolean validCheck(String testObject) {
        return testObject.matches("(^[a-z]*$)");
    }
}
