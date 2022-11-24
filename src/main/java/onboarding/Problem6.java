package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem6 {

    private static final String E_MAIL = "@email.com";
    private static final int NICKNAME_MIN_RANGE = 1;
    private static final int NICKNAME_MAX_RANGE = 20;
    private static final int E_MAIL_MIN_RANGE = 11;
    private static final int E_MAIL_MAX_RANGE = 20;


    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = new ArrayList<>();
        for (List<String> form : forms) {
            List<String> nickNameDuplicationList = makeNickNameDuplication(forms);
            if (checkValid(form)) {
                String nickName = form.get(1);
                for (int length = 0; length < nickName.length() - 1; length++) {
                    nickNameDuplicationList.remove(nickName.substring(length, length + 2));
                }
                for (int length = 0; length < nickName.length() - 1; length++) {
                    if (nickNameDuplicationList.contains(nickName.substring(length, length + 2))) {
                        answer.add(form.get(0));
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        Collections.sort(answer);
        return answer;
    }

    static List<String> makeNickNameDuplication(List<List<String>> forms) {
        List<String> nickNameDuplication = new ArrayList<>();
        for (List<String> form : forms) {
            String nickName = form.get(1);
            for (int length = 0; length < nickName.length() - 1; length++) {
                nickNameDuplication.add(nickName.substring(length, length + 2));
            }
        }
        return nickNameDuplication;
    }

    static boolean checkValid(List<String> form) {
        return checkEmailRange(form) && checkNickNameRange(form) && checkEmail(form);
    }

    static boolean checkEmailRange(List<String> form) {
        return E_MAIL_MIN_RANGE <= form.get(0).length() && form.get(0).length() < E_MAIL_MAX_RANGE;
    }


    static boolean checkNickNameRange(List<String> form) {
        return NICKNAME_MIN_RANGE <= form.get(1).length() && form.get(1).length() < NICKNAME_MAX_RANGE;
    }

    static boolean checkEmail(List<String> form) {
        return form.get(0).endsWith(E_MAIL);
    }
}
