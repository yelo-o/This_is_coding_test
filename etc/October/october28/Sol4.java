package etc.October.october28;

public class Sol4 {
    public static void main(String[] args) {
        // 문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
        // my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
        String my_string = "Progra21Sremm3";
        String answer = "";
        int s = 6, e = 12;
        //6 -> 12, 7 -> 11, 8 -> 10, 9 -> 9
        for (int i=0; i<my_string.length(); i++) {
            if (i>=s && i<=(e)) { //6,7,8
                answer += my_string.charAt(e + s - i);
            } else {
                answer += my_string.charAt(i);
            }
        }
        System.out.println(answer);


    }
}
