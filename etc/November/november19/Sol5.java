package etc.November.november19;

import java.util.Arrays;

public class Sol5 {
    public static void main(String[] args) {
        // TODO 함수 solution은 정수 n을 매개변수로 입력받습니다.
        //  n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
        long n = 118372;
        long answer = 0;

        String numberStr = String.valueOf(n);
        int len = numberStr.length();
        Integer[] arr = new Integer[len];

        //자릿수 하나씩 넣기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.delete(0, sb.length()); //sb 초기화
            sb.append(numberStr.charAt(i));
            arr[i] = Integer.parseInt(String.valueOf(sb));
        }

        //long[] 내림차순 정렬
        Arrays.sort(arr, (x, y) -> y - x);

        //배열에서 하나씩 꺼내서 숫자로 변환
        for (Integer num : arr) {
            answer += num * (long) Math.pow(10, len - 1);
            len--;
        }

        System.out.println(answer);

    }
}
