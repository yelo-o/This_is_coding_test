package etc.November.november10;

public class Sol3 {
    public static void main(String[] args) {
        // 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
        // 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
        long n = 12345;
        int[] answer = {};
        String s = String.valueOf(n);
        int len = s.length();
        answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = s.charAt(len - i - 1) -48;
        }
        for (int i : answer) {
            System.out.print(i + " ");
        }


    }
}
