package etc.October.october28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol3 {
    public static void main(String[] args) {
        // 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
        // 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
        // 문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
        String my_string = "banana";
        // 0~5 ,1~5, 2~5, 3~5, 4~5, 5~5
        List<String> list = new ArrayList<>();
        for (int i=0; i<my_string.length(); i++) {
            list.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(list);
        String[] answer = list.toArray(new String[0]);


    }
}
