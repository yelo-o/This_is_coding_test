package etc.November.november09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sol4 {
    public static void main(String[] args) {
        // 문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때
        // 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
        String[] strArr = {"a", "bc", "d", "efg", "hi"};
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            list.add(strArr[i].length());
        }

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        System.out.println(map);
        map.forEach((key, value) -> list2.add(value));
        for (int i : list2) {
            if (answer < i) {
                answer = i;
            }
        }
        System.out.println(answer);









    }
}
