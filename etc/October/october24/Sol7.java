package etc.October.october24;

import java.util.*;

public class Sol7 {
    public static void main(String[] args) {
        // 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
        // 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)^2 점을 얻습니다.
        // 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
        // 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
        // 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
        int a = 4;
        int b = 4;
        int c = 2;
        int d = 4;
        int answer = 0;
//        int[] arr = {a, b, c, d};
        List<Integer> list = new ArrayList<>(Arrays.asList(a, b, c, d));

        Set<Integer> set = new HashSet<>(Arrays.asList(a, b, c, d));

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
            System.out.println(map);
        }

        if (set.size() == 1) { // 주사위 숫자가 모두 같다.
            answer = 1111 * set.hashCode();
        } else if (set.size() == 2) {
            answer = 1;
            int p = 1;
            int q = 1;
            // 3, 1 인 경우 -> 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)^2 점을 얻습니다.
            if (map.containsValue(3)) {
                for (int key : map.keySet()) {
                    if (map.get(key) == 3) {
                        p = key;
                    } else if (map.get(key) == 1) {
                        q = key;
                    }
                }
                answer = (10 * p + q) * (10 * p + q);
            } else { // 2, 2 인 경우 -> 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
                List<Integer> newList = new ArrayList<>();
                for (int key : map.keySet()) {
                    if (map.get(key) == 2) {
                        newList.add(key);
                    }
                }
                answer = (newList.get(0) + newList.get(1)) * Math.abs(newList.get(0) - newList.get(1));
            }

        } else if (set.size() == 3) { // 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
            answer = 1;
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    answer *= key;
                }
            }

        } else if (set.size() == 4) { //주사위 숫자가 모두 다르다.
            Collections.sort(list);
            answer = list.get(0);
        }

        System.out.println("답 : " + answer);

    }

}
