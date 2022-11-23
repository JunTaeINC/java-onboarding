package onboarding;

public class Problem2 {
    private static final String EXCEPTION = "예외 발생";
    public static String solution(String cryptogram) {

    }

    static String  validCheck(String testObject) {
        if (!testObject.matches("(^[a-z]*$)")){
            System.out.println(EXCEPTION);
        }
        return testObject;
    }
}
