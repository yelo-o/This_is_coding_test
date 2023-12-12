package etc.November.november19;

public class Sol3 {
    public static void main(String[] args) {
        //TODO 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        // 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
        int n = 987;
        int answer = 0;

        String numberStr = String.valueOf(n);
        int len = numberStr.length();
        for (int i = 0; i < len; i++) {
            String s = "";
            s += numberStr.charAt(i);
            answer += Integer.parseInt(s);
        }
        System.out.println(answer);

    }
}
