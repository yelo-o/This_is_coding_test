package etc.October.october26;

public class Sol1 {
    public static void main(String[] args) {
        // 정수 start_num와 end_num가 주어질 때,
        // start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        int start = 10, end_num = 3;
        int gap = start - end_num + 1; //8

        int[] answer = new int[gap];
        for (int i=0; i<gap; i++) {
            answer[i] = start - i;
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }

}
