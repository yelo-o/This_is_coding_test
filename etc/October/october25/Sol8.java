package etc.October.october25;

public class Sol8 {
    public static void main(String[] args) {
        // 정수로 이루어진 문자열 n_str이 주어질 때,
        // n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
        String n_str = "0010";
        String answer = "";
        int idx = 0;
        for (int i=0; i<n_str.length(); i++) {
            if (n_str.charAt(i)!='0') {
                idx = i;
                break;
            }
        }
        for (int i=idx; i<n_str.length(); i++) {
            answer += n_str.charAt(i);
        }
        System.out.println(answer);

    }

}
