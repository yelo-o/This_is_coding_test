package etc.October.october27;

public class Sol2 {
    public static void main(String[] args) {
        // 정수 배열 numbers가 매개변수로 주어집니다.
        // numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
        int[] numbers = {-500,2};
        int maxValue = Integer.MAX_VALUE * -1;
        int answer = 0;
        int mul = 0;
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                mul = numbers[i] * numbers[j];
                if (mul > answer) {
                    answer = mul;
                }
            }
        }
        int mul2 = 0;
        if (answer == 0){
            for (int i=0; i<numbers.length; i++) {
                for (int j=i+1; j<numbers.length; j++) {
                    mul2 = numbers[i] * numbers[j];
                    if (mul2>maxValue) {
                        maxValue = mul2;
                    }
                }
            }
        }
        System.out.println(answer);
        System.out.println(mul2);

    }

}
