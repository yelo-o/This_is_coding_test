package etc.October.october27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol8 {
    public static void main(String[] args) {
        // 정수 배열 array가 매개변수로 주어질 때,
        // 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
        int[] array = {1, 8, 3};
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i :array) {
            list.add(i);
            list2.add(i);
        }

        Collections.sort(list);
        answer[0] = list.get( list.size() - 1 );
        System.out.println(list);
        int index = list2.indexOf(answer[0]);
        answer[1] = index;
        for (int a : answer) {
            System.out.println(a);
        }

    }

}
