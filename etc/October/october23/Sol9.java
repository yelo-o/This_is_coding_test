package etc.October.october23;

public class Sol9 {
    public static void main(String[] args) {
        // 문자열 my_string과 정수 n이 매개변수로 주어질 때,
        // my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
        String my_string = "ProgrammerS123";
        int n = 11;
        int len = my_string.length();
        String answer = "";
        answer = my_string.substring(len - n);
        System.out.println(answer);

    }

}
