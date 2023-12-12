package etc.October.october28;

import java.util.Arrays;

public class Sol2_1 {
    public static void main(String[] args) {
        // 문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
        // 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다.
        // 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        int k = 50000, s = 5, l = 5;
        Arrays.stream(intStrs).mapToInt(item -> Integer.parseInt(item.substring(s, s + l)))
                .filter(item -> k < item)
                .toArray();



    }
}
