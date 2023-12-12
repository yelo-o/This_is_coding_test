package etc.November.november02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sol1 {
    public static void main(String[] args) {
        //배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i=0; i<commands.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j=commands[i][0] - 1; j<commands[i][1]; j++) {
                list.add(array[j]);
//                System.out.println(list);
            }
            Collections.sort(list);
            numberList.add(list.get(commands[i][2]-1));
        }
        System.out.println(numberList);
        int[] answer = Arrays.stream(numberList.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();

    }
}
