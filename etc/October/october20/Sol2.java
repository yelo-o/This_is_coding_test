package etc.October.october20;

public class Sol2 {
    public static void main(String[] args) {
//    정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
        int n = 15;
        int len = (int) (Math.ceil(n / 2.0));
        int[] answer = new int[len];
        System.out.println(len);
        for (int i=0; i<len; i++) {
            answer[i] = 2 * i + 1;
        }
        for(int i : answer) {
            System.out.print(i+" ");
        }
    }
}
