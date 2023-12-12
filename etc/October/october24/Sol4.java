package etc.October.october24;

public class Sol4 {
    public static void main(String[] args) {
        // 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
        // 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
        // 문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
        String my_string = "banana";
        String is_suffix = "ana";
        int answer = 0;
        if (my_string.endsWith(is_suffix)) {
            answer = 1;
        } else {
            answer = 0;
        }




    }

}
