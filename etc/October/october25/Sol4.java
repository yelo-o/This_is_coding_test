package etc.October.october25;

import java.util.*;

public class Sol4 {
    public static void main(String[] args) {
        // 정수 배열 arr과 delete_list가 있습니다.
        // arr의 원소 중 delete_list의 원소를 모두 삭제하고
        // 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};

        List<Integer> deletedList = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : delete_list) {
            deletedList.add(i);
        }
        System.out.println(deletedList);
        for (int i : arr) {
            if (!deletedList.contains(i)) {
                set.add(i);
            }
        }
        Integer[] ans = set.toArray(new Integer[0]);
        int[] answer = Arrays.stream(ans).mapToInt(Integer::intValue).toArray();


    }

}
