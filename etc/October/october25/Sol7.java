package etc.October.october25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Sol7 {
    public static void main(String[] args) {
        // 정수로 이루어진 리스트 num_list가 주어집니다.
        // num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        IntStream sorted = Arrays.stream(num_list).sorted();
        List<Integer> smallList = new ArrayList<>();
        List<Integer> ansList = new ArrayList<>();
        for (int i : sorted.toArray()) {
            smallList.add(i);
        }
        for (int i=0;  i<5; i++) {
            ansList.add(smallList.get(i));
        }
        System.out.println(ansList);
        Integer[] ans = ansList.toArray(new Integer[0]);
        int[] answer = Arrays.stream(ans).mapToInt(Integer::intValue).toArray();



    }

}
