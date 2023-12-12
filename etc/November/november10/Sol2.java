package etc.November.november10;

import java.math.BigDecimal;

public class Sol2 {
    public static void main(String[] args) {
        // 0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
        String a = "582", b = "734";
        String answer = "";
        BigDecimal numberA = new BigDecimal(a);

        BigDecimal numberB = new BigDecimal(b);
        BigDecimal sum = numberA.add(numberB);
//        System.out.println(sum);

        answer += String.valueOf(sum);
//        System.out.println(answer);



    }
}
