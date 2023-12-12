package etc.November.november01;

import java.util.HashSet;
import java.util.Set;

public class Sol3 {
    public static void main(String[] args) {
        //폰켓몬을 고르는데 전체 배열의 수에서/2의 개수까지만 가져갈 수 있고, 최대한 중복되지 않게 가져가야 한다.
        int[] nums = {3,3,3,2,2,4};
        int answer = 0;
        int max = nums.length/2;
        System.out.println(max);
        Set<Object> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        System.out.println(set);
        if (set.size() > max) {
            answer = max;
        } else {
            answer = set.size();
        }

    }

}
