package etc.October.october25;

import java.util.ArrayList;
import java.util.List;

public class Sol6 {
    public static void main(String[] args) {
        // 정수 리스트 num_list와 정수 n이 주어질 때,
        // num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠
        // n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
        int[] num_list = {2, 1, 6};
        int n = 1;

        List<Integer> head = new ArrayList<>();
        List<Integer> tail = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i=0; i<num_list.length; i++) {
            if (i<n) {
                head.add(num_list[i]);
            } else {
                tail.add(num_list[i]);
            }
        }
        System.out.println(head);
        System.out.println(tail);
        int[] answer = new int[head.size() + tail.size()];
        for (int i=0; i<tail.size(); i++) {
            ans.add(tail.get(i));
        }
        for (int i=0; i<head.size(); i++) {
            ans.add(head.get(i));
        }
        for (int i=0; i<answer.length; i++) {
            answer[i] = ans.get(i);
        }

        for (int i : answer) {
            System.out.println(i);
        }





    }

}
