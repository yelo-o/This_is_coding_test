package etc.November.november18;

public class Sol3 {
    public static void main(String[] args) {
        // TODO 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        double answer = 0;
        for (int i : arr) {
            sum += i;
        }
        answer = (double) sum / arr.length;
        System.out.println(answer);

    }
}
