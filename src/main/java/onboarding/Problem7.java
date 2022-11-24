package onboarding;

import java.util.*;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        Map<String, Integer> nameAndScore = makeHashMap(friends);

        List<String> userFriendList = makeUserFriendList(user, friends);
        putVisitors(nameAndScore, visitors);
        user
    }

    static Map<String, Integer> userFriendGetScore(Map<String, Integer> nameAndScore,List<List<String>> friends , List<String> userFriendList) {
        for (String userFriend : userFriendList) {
            for(List<String> friend : friends) {
                if(Objects.equals(friend.get(0), userFriend)) {
                    nameAndScore.put(friend.get(1) , nameAndScore.get(friend.get(1)) + 10);
                }
            }
        }
        return nameAndScore;
    }

    static List<String> makeUserFriendList(String user, List<List<String>> friendsList) {
        List<String> userFriendList = new ArrayList<>();
        for (List<String> friends : friendsList) {
            if (Objects.equals(friends.get(1), user)) {
                userFriendList.add(friends.get(0));
            }
        }
        return userFriendList;
    }

    static Map<String, Integer> putVisitors(Map<String, Integer> nameAndScore, List<String> visitors) {
        for (String visitor : visitors) {
            if (nameAndScore.containsKey(visitor)) {
                nameAndScore.put(visitor, nameAndScore.get(visitor) + 1);
            } else {
                nameAndScore.put(visitor, 0);
            }
        }
        return nameAndScore;
    }

    static Map<String, Integer> makeHashMap(List<List<String>> friends) {
        Map<String, Integer> nameAndScore = new HashMap<>();
        for (List<String> friend : friends) {
            nameAndScore.put(friend.get(0), 0);
            nameAndScore.put(friend.get(1), 0);
        }
        return nameAndScore;
    }

    static
}
