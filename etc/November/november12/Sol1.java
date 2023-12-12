package etc.November.november12;

public class Sol1 {
    public static void main(String[] args) {
        // 이차원 정수 배열 arr이 매개변수로 주어집니다.
        // arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고,
        // 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
        int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        int[][] answer = {};

        int rowSize = arr.length;
        int colSize = arr[0].length;
        int gap = Math.abs(rowSize - colSize);
        System.out.println("row size : "+ rowSize);
        System.out.println("column size : "+ colSize);
        System.out.println("gap : "+ gap);

        if (rowSize > colSize) {
            answer = new int[rowSize][colSize + gap];

            //insert arr's data
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            //insert zero data
            for (int i = 0; i < rowSize; i++) {
                for (int j = colSize; j < rowSize; j++) {
                    answer[i][j] = 0;
                }
            }
        } else if (rowSize < colSize) {
            answer = new int[rowSize + gap][colSize];
            //insert arr's data
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            //insert zero data
            for (int i = colSize; i < rowSize; i++) {
                for (int j = 0; j < rowSize; j++) {
                    answer[i][j] = 0;
                }
            }
        } else {
            answer = arr;
        }



    }
}
