package etc.October.october26;

public class Sol7 {
    public static void main(String[] args) {
        // 정수 리스트 num_list가 주어집니다.
        // 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요.
        // 두 값이 같을 경우 그 값을 return합니다.
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int answer = 0;
        int sumOdd = 0, sumEven = 0;
        for (int i=0; i< num_list.length; i++) {
            if(i%2 == 0) { //홀수번째 일떄
                sumOdd += num_list[i];
            } else {
                sumEven += num_list[i];
            }
        }
        if (sumOdd > sumEven) {
            answer = sumOdd;
        } else if (sumOdd < sumEven) {
            answer = sumEven;
        } else {
            answer = sumOdd;
        }
        System.out.println(answer);

    }

}
