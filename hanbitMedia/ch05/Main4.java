package hanbitMedia.ch05;

public class Main4 {
    public static void recursiveFunction(int i) {
        //100번째 호출을 했을 때 종료되도록 조건 명시
        if (i == 100) {
            return;
        }
        System.out.println(i + "번째 재귀함수에서 " + (i + 1) + "번째 재귀함수를 호출합니다.");
        recursiveFunction(i + 1);
        System.out.println(i + "번째 재귀 함수를 종료합니다.");
    }

    public static void main(String[] args) {
        recursiveFunction(1);
    }

}
