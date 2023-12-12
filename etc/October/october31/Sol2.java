package etc.October.october31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol2 {
    public static void main(String[] args) {
        // 정수 배열 arr가 주어집니다.
        // 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
        // 단, arr에 2가 없는 경우 [-1]을 return 합니다.
        int[] arr = {1, 2, 1, 4, 5, 2, 9};
//        int[] arr = {1, 2, 1};
        List<Integer> indexList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                indexList.add(i);
            }
        }
        System.out.println(indexList);
        if (indexList.isEmpty()) {
            list.add(-1);
        } else {
            int end = indexList.get(indexList.size() - 1);
            int start = indexList.get(0);
            for (int i=start; i<=end; i++) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);


        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();


    }
}
