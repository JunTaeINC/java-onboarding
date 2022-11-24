package onboarding;

public class Problem4 {

    private static final String A_TO_z = "(^[A-z]*$)";
    private static final String EXCEPTION = "예외 발생";
    private static final int a = 97;
    private static final int z = 122;
    private static final int A = 65;
    private static final int Z = 90;


    public static String solution(String word) {
        if (!checkString(word)) {
            return convertString(word);
        } else {
            return EXCEPTION;
        }
    }

    static String convertString(String words) {
        StringBuilder answer = new StringBuilder();
        for (int length = 0; length < words.length(); length++) {
            char word = words.charAt(length);
            if ((int) word <= z && a <= (int) word) {
                answer.append((char) (z - (int) word + a));
            } else if ((int) word <= Z && A <= (int) word) {
                answer.append((char) (Z - (int) word + A));
            } else {
                answer.append(word);
            }
        }
        return answer.toString();
    }

    static boolean checkString(String testObject) {
        return testObject.matches(A_TO_z);
    }

}
