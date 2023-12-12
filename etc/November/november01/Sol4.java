package etc.November.november01;

import java.util.*;

public class Sol4 {
    public static void main(String[] args) {
        // 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
        // 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
        // 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        //participant의 이름이 몇 명 있었는지 확인
        for (String key : participant) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        //completion 명단에 있는 만큼 map에서 제거
        for (String key : completion) {
            map.put(key, map.getOrDefault(key, 0) - 1);
        }
        System.out.println(map);
        //map에서 값이 0이 아닌 key 호출
        for (String key : participant) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }
        System.out.println(answer);
    }

}
