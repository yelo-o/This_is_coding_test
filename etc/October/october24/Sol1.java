package etc.October.october24;

public class Sol1 {
    public static void main(String[] args) {
        // 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
        String num_str = "123456789";
        int answer = 0;
        for (int i=0; i<num_str.length(); i++) {
            answer += num_str.charAt(i) - 48;
        }
        System.out.println(answer);

    }

}
