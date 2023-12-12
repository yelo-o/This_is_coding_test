package etc.November.november04;

public class Sol1 {
    public static void main(String[] args) {
        // 문자열 myString과 pat이 주어집니다.
        // myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.

        int answer = 0;
        String myString = "banana",  pat = "ana";
        for(int i = myString.length()-1; i>=0; i--){
            String subStr = myString.substring(0, i+1);
            if(subStr.endsWith(pat)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
