package etc.October.october22;

public class Sol5 {
    public static void main(String[] args) {
        //어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
        // 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
        //문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
        String my_string = "banana";
        String is_prefix = "nan";
        int answer = 0;
        if (my_string.startsWith(is_prefix)) {
            answer = 1;
        } else {
            answer = 0;
        }
        System.out.println("답은 : " + answer);

    }

}
