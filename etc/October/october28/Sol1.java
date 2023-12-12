package etc.October.october28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol1 {
    public static void main(String[] args) {
        // 문자열 myString이 주어집니다.
        // "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
        // 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
        String myString = "axxbxx";
        String[] split = myString.split("x");
        List<String> list = new ArrayList<>();
        for (int i=0; i<split.length; i++) {
            if (!split[i].equals("x")  && !split[i].isEmpty()) {
                list.add(split[i]);
            }
        }

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        String[] answer = list.toArray(new String[0]);

        for (String a : answer) {
            System.out.println(a);
        }

    }
}
