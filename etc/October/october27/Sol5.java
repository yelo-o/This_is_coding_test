package etc.October.october27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sol5 {
    public static void main(String[] args) {
        // 문자열 my_string이 매개변수로 주어질 때,
        // my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
        String my_string = "hi12392";
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i) < 65) { //ASCII CODE 65 = 'A'
                list.add( (int) my_string.charAt(i) - 48);
            }
        }
        System.out.println(list); //1,2,3,9,2
        Collections.sort(list);
        System.out.println(list); //1,2,3,9,2
        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();


    }

}
