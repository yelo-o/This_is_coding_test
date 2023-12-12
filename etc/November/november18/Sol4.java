package etc.November.november18;

import java.util.ArrayList;
import java.util.List;

public class Sol4 {
    public static void main(String[] args) {
        //TODO 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
        int n = 12;
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        for (int number : list) {
            answer += number;
        }
        System.out.println(answer);
    }
}
