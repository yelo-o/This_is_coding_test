package etc.October.october23;

import java.util.ArrayList;
import java.util.List;

public class Sol5 {
    public static void main(String[] args) {
        //정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        int[] num_list = new int[]{2,1,6};
        int n = 3;
        int len = num_list.length;
        int[] answer = new int[len-n+1];
        List<Integer> list = new ArrayList<>();

        for (int i=n-1; i<len; i++) {
            list.add(num_list[i]);
        }
        for (int l : list) {
            System.out.println(l);
        }
        for (int i=0; i<len - n + 1; i++) {
            answer[i] = list.get(i);
        }
        for (int a : answer) {
            System.out.println(a);
        }




    }

}
