package etc.November.november09;

public class Sol3 {
    public static void main(String[] args) {
        // 정수 배열 arr이 매개변수로 주어집니다.
        // arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
        // arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
        int[] arr = {58, 172, 746, 89};
        int[] answer = {};
        int len = arr.length;

        int num = 0;
        while (len > (int) Math.pow(2, num)) {
            num++;
        }
        int actualLen = (int) Math.pow(2, num);
        System.out.println(actualLen);
        answer = new int[actualLen];
        for (int i = 0; i < actualLen; i++) {
            if (i < len) {
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }
        for (int i : answer) {
            System.out.print(i + " ");
        }


    }
}
