package etc.October.october31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol4 {
    public static void main(String[] args) {
        // 정수 배열 arr와 query가 주어집니다. query를 순회하면서 다음 작업을 반복합니다.
        // 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
        // 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
        // 위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
//        int[] arr = {0, 1, 2, 3, 4, 5};
//        int[] query = {4, 1, 2};
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {5, 0};
        List<Integer> list = new ArrayList<>();
        for (int i: arr) {
            list.add(i);
        }

        for (int i=0; i<query.length; i++) {
            if (i%2 == 0) {
                int len = list.size();
                for (int j=query[i]+1; j<len; j++) { //5
                    list.remove(list.size()-1);
                    System.out.println(list);
                }
            } else {
                for (int j=0; j<query[i]; j++) { //0
                    list.remove(0);
                    System.out.println(list);
                }
            }
        }
        System.out.println(list);
        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();

    }
}
