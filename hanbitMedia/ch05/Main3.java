package hanbitMedia.ch05;

public class Main3 {
    public static void recursiveFunction() {
        System.out.println("재귀함수를 호출합니다.");
        recursiveFunction();
    }

    public static void main(String[] args) {
        recursiveFunction();
    }
    //error 발생 : java.lang.StackOverflowError

}
