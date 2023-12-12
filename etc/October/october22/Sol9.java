package etc.October.october22;

import java.util.ArrayList;
import java.util.List;

public class Sol9 {
    public static void main(String[] args) {
        //단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
        // my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
        String my_string = "i    love  you";
        String[] split = my_string.split(" ");
        List<String> list = new ArrayList<>();
        for (int i=0; i< split.length; i++) {
            if(!split[i].isBlank()) {
                list.add(split[i]);
            }
        }
        String[] answer = new String[list.size()];
        for (int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        for (String s : answer) {
            System.out.print(s + " ");
        }


    }

}
