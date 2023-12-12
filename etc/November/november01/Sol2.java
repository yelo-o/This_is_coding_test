package etc.November.november01;

public class Sol2 {
    public static void main(String[] args) {
        // 정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다. 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.
        int[] num_list = {12, 4, 15, 1, 14};
        int answer = 0;
        for (int i=0; i<num_list.length; i++) {
            int no = num_list[i];
            while (no > 1) {
                if (no%2 == 0) { //no is even
                    no /= 2;
                } else if (no%2 != 0) { //no is odd
                    no = (no - 1) / 2;
                }
                answer++;
            }
        }

        System.out.println(answer);
    }

}
