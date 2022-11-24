package onboarding;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    private static final List<Integer> MONEY_UNIT = List.of(50_000, 10_000, 5_000, 1_000, 500, 100, 50, 10, 1);
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 1_000_000;


    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        return answer;
    }

    static boolean checkMoneyRange(int money) {
        return MIN_RANGE <= money && money <= MAX_RANGE;
    }

}

