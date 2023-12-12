package etc.October.october26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol6 {
    public static void main(String[] args) {
        // 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
        // numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        List<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            if (i%n == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
        //배열을 스트림으로 변환
        //Integer 객체의 intValue 메소드를 호출하여 각 요소를 int로 변환
        //toArray() : 스트림의 요소를 배열로 변환하는 메소드
    }

}
