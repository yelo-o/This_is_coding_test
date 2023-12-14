package hanbitMedia.ch05;

public class Main5 {
    //팩토리얼 구현하기

    // TODO 1. 반복적으로 구현하기
    public static int factorialIterative(int n) {
        int result = 1;
        //1 ~ n까지 숫자 차례로 곱하기
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // TODO 2. 재귀적으로 구현하기
    public static int factorialRecursive(int n) {
        //n이 1이하인 경우 1을 반환
        if (n <= 1) {
            return 1;
        }
        // n! = n * (n - 1)!를 그대로 코드로 작성하기
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        // 각각의 방식으로 구현한 n! 출력(n = 5)
        System.out.println("반복적으로 구현:" + factorialIterative(5));
        System.out.println("재귀적으로 구현:" + factorialRecursive(5));
    }

}
