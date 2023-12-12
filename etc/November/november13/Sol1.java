package etc.November.november13;

public class Sol1 {
    public static void main(String[] args) {
        // 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
        // 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
        int numer1 = 1, denom1 = 2, numer2 = 3, denom2 = 4;
        int[] answer = new int[2];
        answer[0] = numer1 * denom2 + numer2 * denom1;
        answer[1] = denom1 * denom2;

        System.out.println(answer[0]);
        System.out.println(answer[1]);
        for (int i = answer[0]; i > 1; i--) {
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                answer[0] = answer[0] / i;
                answer[1] = answer[1] / i;
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);




    }
}
