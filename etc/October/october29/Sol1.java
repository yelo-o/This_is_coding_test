package etc.October.october29;

public class Sol1 {
    public static void main(String[] args) {
        // 문자열 my_string과 두 정수 m, c가 주어집니다.
        // my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
        String my_string = "ihrhbakrfpndopljhygc";
        System.out.println(my_string.length());
        int m = 4,  c = 2;
        String answer = "";
        for (int i=0; i<my_string.length(); i++) {
            if(i%m == (c-1)) {
                answer += my_string.charAt(i);
            }
        }
        System.out.println(answer);


    }
}
