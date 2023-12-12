package etc.October.october26;

public class Sol4 {
    public static void main(String[] args) {
        // 정수 배열 arr과 정수 n이 매개변수로 주어집니다.
        // arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
        // arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27, len = arr.length;
        int[] answer = new int[len];

        for (int i=0; i<len; i++) {
            if(len%2 != 0) { //홀수
                if(i%2 == 0) {
                    arr[i] = arr[i] + n;
                }
            } else {
                if(i%2 != 0) {
                    arr[i] = arr[i] + n;
                }
            }
        }
        for (int i=0; i< answer.length; i++) {
            answer[i] = arr[i];
        }

        for (int i : answer) {
            System.out.println(i);
        }



    }

}
