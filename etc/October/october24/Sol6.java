package etc.October.october24;

public class Sol6 {
    public static void main(String[] args) {
        // boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때,
        // 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;
        boolean answer = true;
        answer = (x1 || x2) && (x3 || x4);
        System.out.println(answer);


    }

}
