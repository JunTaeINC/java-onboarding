package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {

    private static final String E_MAIL = "@email.com";
    private static final int NICKNAME_MIN_RANGE = 1;
    private static final int NICKNAME_MAX_RANGE = 20;
    private static final int E_MAIL_MIN_RANGE = 11;
    private static final int E_MAIL_MAX_RANGE = 20;


    public static List<String> solution(List<List<String>> forms) {


    }

    static List<String> makeNickNameDuplication(List<List<String>> forms) {
        List<String> nickNameDuplication = new ArrayList<>();
        for (List<String> form : forms) {
            String nickName = form.get(1);
            for (int length = 0; length < nickName.length() - 2; length++) {
                nickNameDuplication.add(nickName.substring(length, length + 1));
            }
        }
        return nickNameDuplication;
    }

    static boolean checkEmailRange(String email) {
        if (E_MAIL_MIN_RANGE <= email.length() && email.length() < E_MAIL_MAX_RANGE) {
            return true;
        }
        return false;
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
