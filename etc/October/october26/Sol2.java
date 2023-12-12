package etc.October.october26;

public class Sol2 {
    public static void main(String[] args) {
        // 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다.
        // myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
        String myString = "ABBAA", pat = "AABB";
        int answer = 0;
        String s = "";
        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i)=='A') {
                s += 'B';
            } else {
                s += 'A';
            }
        }
        if (s.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }
    }

}
