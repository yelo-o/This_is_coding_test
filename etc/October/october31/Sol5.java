package etc.October.october31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sol5 {
    public static void main(String[] args) {
        // 문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
        // str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를,
        // 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        // "l"이나 "r"이 없다면 빈 리스트를 return합니다.
        String[] str_list = {"u", "u", "l", "r"};
//        String[] str_list = {"l"};
        List<String> tmp = new ArrayList<>();
        List<String> list = new ArrayList<>();

        Collections.addAll(tmp, str_list); //배열(str_list) -> 리스트(tmp)

        int r = tmp.indexOf("r");
        int l = tmp.indexOf("l");
        System.out.println(l);
        System.out.println(r);
        if (l!=-1 && r!=-1) { //l과 r이 모두 있을 때
            if (l < r) { //l이 먼저 나옴
                list.addAll(Arrays.asList(str_list).subList(0, l)); //0부터 l 이전까지
            } else if (r < l) { //r이 먼저 나옴
                list.addAll(Arrays.asList(str_list).subList(r+1, str_list.length)); //r+1부터 끝까지
            }
        } else if (l == -1 && r != -1) { //r만 있을 때
            for (int i=r+1; i< str_list.length; i++) {
                list.add(str_list[i]);
            }
        } else if (r == -1 && l != -1) { //l만 있을 때
            for (int i=0; i<l; i++) {
                list.add(str_list[i]);
            }
        } else { //l과 r이 모두 없을 때
            list.clear();
        }
        System.out.println(list);
        String[] answer = list.toArray(new String[0]);



    }
}
