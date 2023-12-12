package etc.November.november01;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol5 {
    public static void main(String[] args) {
        // 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
        // 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
        // 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
        int[] arr = {4,4,4,3,3};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            int size = list.size();
            if (size == 0) {
                list.add(arr[i]);
            } else {
                if (list.get(size - 1) != arr[i]) {
                    list.add(arr[i]);
                }
            }
        }

        System.out.println(list);

        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();


    }

}
