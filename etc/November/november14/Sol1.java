package etc.November.november14;

public class Sol1 {
    public static void main(String[] args) {
        // TODO JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
        //  단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
        //  문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
        String s = "3people unFollowed me";
//        String s = "  for the what 1what  ";
        String answer = "";

        int len = s.length();
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if ((int) (s.charAt(i)) == 32 && i != len - 1 && i!=0) { //i번째가 빈칸이면서 마지막 순번이 아닐 때
                answer += Character.toLowerCase(s.charAt(i));
                flag = true;
            } else if (flag == true || i==0) {
                answer += Character.toUpperCase(s.charAt(i));
                flag = false;

            } else {
                answer += Character.toLowerCase(s.charAt(i));
            }
        }

        System.out.println(answer);

    }
}
