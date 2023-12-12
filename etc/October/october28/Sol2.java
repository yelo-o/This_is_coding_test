package etc.October.october28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol2 {
    public static void main(String[] args) {
        // 문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
        // 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다.
        // 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        int k = 50000, s = 5, l = 5;
        List<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (String intStr : intStrs) {
            String str = "";
            for (int i=0; i<intStr.length(); i++) {
                if (i>=s && i<=(s + l - 1) ) {
                    str += intStr.charAt(i);
                }
            }
            list.add(str);
        }
        for (String str : list) {
            if (Integer.parseInt(str) > k) {
                list2.add(Integer.parseInt(str));
            }
        }
        System.out.println(list2);
        Integer[] array = list2.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();



    }
}
