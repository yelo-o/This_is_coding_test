package etc.October.october23;

public class Sol3 {
    public static void main(String[] args) {
        //영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때,
        //my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
        String my_string = "programmers";
        String alp = "p";
        String answer = "";
        int len = my_string.length();

        for (int i=0; i<len; i++) {
            if (my_string.charAt(i) == alp.charAt(0)) {
                answer += alp.toUpperCase();
            } else {
                answer += my_string.charAt(i);
            }
        }
        System.out.println(answer);

    }

}
