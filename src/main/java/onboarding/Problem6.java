package onboarding;

import java.util.List;

public class Problem6 {

    private static final String E_MAIL = "@email.com";
    private static final int NICKNAME_MIN_RANGE = 1;
    private static final int NICKNAME_MAX_RANGE = 20;

    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    }

    static boolean checkNickNameRange(String nickName) {
        if (NICKNAME_MIN_RANGE <= nickName.length() && NICKNAME_MAX_RANGE < 20) {
            return true;
        }
        return false;
    }

    static boolean checkEmail(String email) {
        if (email.endsWith(E_MAIL)) {
            return true;
        }
        return false;
    }
}
