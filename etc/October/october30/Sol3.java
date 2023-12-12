package etc.October.october30;

import java.util.ArrayList;
import java.util.List;

public class Sol3 {
    public static void main(String[] args) {
        // 문자열 my_string과 정수 배열 indices가 주어질 때,
        // my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        List<Integer> list = new ArrayList<>();
        for (int i : indices) {
            list.add(i);
        }

        String answer = "";
        for (int i=0; i<my_string.length(); i++) { //i가 indices에 포함되지 않는 숫자면 추가
            if (!list.contains(i)) {
                answer += my_string.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
