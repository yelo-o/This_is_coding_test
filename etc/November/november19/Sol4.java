package etc.November.november19;

public class Sol4 {
    public static void main(String[] args) {
        //TODO 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
        // n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
        long n = 121;
        long answer = 0;
        System.out.println(Math.sqrt(n));

        double x = Math.sqrt(n);
        System.out.println(x);
        for (int i = 0; i < 7071067; i++) {
            if (i == Math.sqrt(n)) {
                answer = (long) Math.pow((long) x + 1, 2);
                break;
            }
        }
        if (answer == 0) {
            answer = -1;
        }

        System.out.println(answer);
    }
}
