package etc.October.october30;

public class Sol2 {
    public static void main(String[] args) {
        // 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때,
        // my_string에서 'A'의 개수, my_string에서 'B'의 개수,...,
        // my_string에서 'Z'의 개수, my_string에서 'a'의 개수,
        // my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를
        // 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
        String my_string = "Programmers";
        int[] answer = new int[52];
        for (int i=0; i<my_string.length(); i++) {
            if ((int) my_string.charAt(i) <=90) { //대문자이면
                System.out.println((int) my_string.charAt(i));
                System.out.println("변환후");
                System.out.println((int) (my_string.charAt(i) - 65));
                answer[(int) (my_string.charAt(i) - 64)]++;
            } else if ((int) my_string.charAt(i) > 90) {
                System.out.println((int) my_string.charAt(i));
                System.out.println("변환후");
                System.out.println((int) (my_string.charAt(i) - 71));
                answer[(int) (my_string.charAt(i)) - 96]++;
            }
        }

        //65(A) ~ 122(z)
//        System.out.println((int) 'Z');
//        System.out.println((int) 'a');
//        System.out.println();

        //A B CDEFGHUJKLMOP
        //65
    }
}
