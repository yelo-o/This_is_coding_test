package etc.November.november13;

import java.util.*;

public class Sol2 {
    public static void main(String[] args) {
        // 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
        // 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
        // 최빈값이 여러 개면 -1을 return 합니다.
//        int[] array = {1, 2, 3, 3, 3, 4};
        int[] array = {1, 1, 2, 3};
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }

        System.out.println(map);
        System.out.println(list);
        list.clear();

        //value가 가장 큰 값 찾기
        Set<Integer> set = map.keySet();
        System.out.println(set);
        int max = 0;
        for (int s : set) {
            list.add(map.get(s));
            if (max < map.get(s)) {
                max = map.get(s);
                answer = s;
            }
        }
        System.out.println("answer : " + answer);

        System.out.println(list);
        //중복되는게 있는지 없는지만 체크
        int cnt = 0;
        for (int i : list) {
            if (i == max) {
                cnt++;
            }
        }
        if (cnt > 1) {
            answer = -1;
        }
        System.out.println(answer);

    }
}
