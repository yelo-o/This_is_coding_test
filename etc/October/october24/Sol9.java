package etc.October.october24;

public class Sol9 {
    public static void main(String[] args) {
        // 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
        // queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
        // my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
        String my_string ="rermgorpsam";
        char[] chars = my_string.toCharArray();
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        String answer = "";

        for (int i=0; i<queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j=start; j<=(start + end)/2; j++) {
                char tmp = chars[j];
                chars[j] = chars[start + end - j];
                chars[start + end - j] = tmp;
            }

        }

        for (char c : chars) {
            answer += c;
        }
        System.out.println(answer);



    }

}
