package etc.October.october30;

public class Sol5 {
    public static void main(String[] args) {
        // 정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
        int n = 3;
        int[][] answer = new int[n][n];
        for (int i=0; i<answer.length; i++) {
            for (int j=0; j<answer.length; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                }
            }
        }



    }
}
