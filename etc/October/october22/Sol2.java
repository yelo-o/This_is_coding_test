package etc.October.october22;

public class Sol2 {
    public static void main(String[] args) {
        //문자열 my_string이 매개변수로 주어집니다.
        // my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요. 자연수는 한자리 수 입니다.

        String my_string = "aAb1B2cC34oOp";
        int answer = 0;
        int len = my_string.length();
        //String 자를 줄 알아야함.
        char c = my_string.charAt(3);
        char c2 = my_string.charAt(5);
        System.out.println(c);
        System.out.println((int) c);
        System.out.println((int) c2);

        for (int i=0; i<len; i++) {
            if ((int) (my_string.charAt(i)) < 65 ) {
                answer += (int) (my_string.charAt(i)) - 48;
            }

        }
        System.out.println("답은 : " + answer);



    }

}
