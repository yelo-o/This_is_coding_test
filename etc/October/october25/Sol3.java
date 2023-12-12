package etc.October.october25;

import java.util.ArrayList;
import java.util.List;

public class Sol3 {
    public static void main(String[] args) {
        // 정수 n과 k가 주어졌을 때,
        // 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
        int n = 10, k = 3;

        List<Integer> list = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            if (i%k == 0) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        System.out.println(list);

    }

}
