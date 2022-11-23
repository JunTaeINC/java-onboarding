package onboarding;

import java.util.List;

class Problem1 {
    //리스트/배열 pobi와 crong이 주어질 때, 포비가 이긴다면 1, 크롱이 이긴다면 2, 무승부는 0, 예외사항은 -1로 return
    //왼쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
    private final int MAX_RANGE = 400;
    private final int MIN_RANGE = 1;
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        Integer a = 123;

    }

    public boolean pageValidCheck(List<Integer> pageNumbers){
        return pageNumbers.get(1) - pageNumbers.get(0) == 1 &&
                MIN_RANGE <= pageNumbers.get(0) && MAX_RANGE >= pageNumbers.get(1);
    }
}