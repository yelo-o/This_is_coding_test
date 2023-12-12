package etc.November.november16;

public class Sol1 {
    public static void main(String[] args) {
        // TODO 0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.
        //  1. x의 모든 0을 제거합니다.
        //  2. x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
//        String s = "110010101001";
        String s = "01110";
        int[] answer = {};

        answer = new int[2];
        int cnt = 0;
        int times = 0;
        StringBuilder sb = new StringBuilder();

        boolean flag = false;

        while (!flag) {
            times++;
            sb.delete(0,sb.length());
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    sb.append('1');
                } else {
                    cnt++;
                }
            }
            s = String.valueOf(sb);
            System.out.println(s);
            int length = s.length();
            s = Integer.toString(length,2); //2진수로 변환
            System.out.println("binaryNumber : "+ s);

            //0이 없는지 검증 로직
            if (s.length() == 1) {
                flag = true;
            }
        }
        answer[0] = times;
        answer[1] = cnt;
        System.out.println(times + ", " + cnt);


    }
}
