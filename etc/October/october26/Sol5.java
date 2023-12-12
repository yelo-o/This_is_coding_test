package etc.October.october26;

public class Sol5 {
    public static void main(String[] args) {
        // 문자열 myString이 주어집니다.
        // myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고,
        // "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
        String myString = "Abstract algebra";
        String answer = "";
        System.out.println((int) myString.charAt(8));
        char[] charArray = myString.toCharArray();

        for (int i=0; i<myString.length(); i++) {
            System.out.print(charArray[i] + 1 + " ");
            if (charArray[i] == 'a') {
                answer += 'A';
            } else if (charArray[i] > 65 && charArray[i] < 97) {
                String s = "";
                s += charArray[i];
                String low = s.toLowerCase();
                answer += low;
            } else if (charArray[i] >= 97 ) {
                answer += charArray[i];
            } else if (charArray[i] == 32) {
                answer += " ";
            } else if (charArray[i] =='A') {
                answer += 'A';
            }
        }
        System.out.println();
        System.out.println(answer);

    }

}
