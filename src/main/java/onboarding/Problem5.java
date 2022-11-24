package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    private static final List<Integer> MONEY_UNIT = List.of(50_000, 10_000, 5_000, 1_000, 500, 100, 50, 10, 1);
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 1_000_000;


    public static List<Integer> solution(int money) {
        if (checkMoneyRange(money)) {
            return moneyCount(money);
        } else {
            throw new IllegalArgumentException();
        }
    }

    static List<Integer> moneyCount(int money) {
        List<Integer> answer = new ArrayList<>();
        for (Integer moneyUnit : MONEY_UNIT) {
            answer.add(money / moneyUnit);
            money %= moneyUnit;
        }
        return answer;
    }

    static boolean checkMoneyRange(int money) {
        return MIN_RANGE <= money && money <= MAX_RANGE;
    }

}

