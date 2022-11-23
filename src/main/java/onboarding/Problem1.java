package onboarding;

import java.util.List;

class Problem1 {

    private static final int MAX_RANGE = 400;
    private static final int MIN_RANGE = 1;
    private static final int POBI_WIN = 1;
    private static final int CRONG_WIN = 2;
    private static final int DRAW = 0;
    private static final int EXCEPTION = 0;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if (!pageValidCheck(pobi) || !pageValidCheck(crong)) {
            return EXCEPTION;
        }
        int maxPobi = Math.max(pageNumberMaxValue(pobi.get(0)), pageNumberMaxValue(pobi.get(1)));
        int maxCrong = Math.max(pageNumberMaxValue(crong.get(0)), pageNumberMaxValue(crong.get(1)));
        return gameResult(maxPobi, maxCrong);
    }

    static int gameResult(int pobi, int crong) {
        if (pobi > crong) {
            return POBI_WIN;
        } else if (pobi < crong) {
            return CRONG_WIN;
        } else {
            return DRAW;
        }
    }

    static boolean pageValidCheck(List<Integer> pageNumbers) {
        return pageNumbers.get(1) - pageNumbers.get(0) == 1 &&
                MIN_RANGE <= pageNumbers.get(0) && MAX_RANGE >= pageNumbers.get(1);
    }

    static int pageNumberMaxValue(int pageNumber) {
        int sum = 0;
        int multiplication = 1;
        while (pageNumber != 0) {
            sum += pageNumber % 10;
            multiplication *= pageNumber % 10;
            pageNumber /= 10;
        }
        return Math.max(sum, multiplication);
    }

}