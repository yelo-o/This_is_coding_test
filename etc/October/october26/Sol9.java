package etc.October.october26;

public class Sol9 {
    public static void main(String[] args) {
        // 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
        String my_string = "cccCCC";
        String answer = "";
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i) < 97) { //대문자이면
                String s = "";
                s += my_string.charAt(i);
                String low = s.toLowerCase();
                answer += low;
            } else {
                String s = "";
                s += my_string.charAt(i);
                String high = s.toUpperCase();
                answer += high;
            }
        }

        System.out.println(answer);

    }

}
