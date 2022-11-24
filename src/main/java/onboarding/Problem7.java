package onboarding;

import java.util.*;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }

    static Map<String, Integer> makeHashMap(List<List<String>> friends) {
        Map<String, Integer> friendAndScore = new HashMap<>();
        for (List<String> friend : friends) {
            friendAndScore.put(friend.get(0), 0);
            friendAndScore.put(friend.get(1), 0);
        }
        return friendAndScore;
    }

}
