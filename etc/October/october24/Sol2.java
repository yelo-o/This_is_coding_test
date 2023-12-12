package etc.October.october24;

public class Sol2 {
    public static void main(String[] args) {
        // 정수로 이루어진 리스트 num_list가 주어집니다.
        // num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] answer = new int[num_list.length - 5];
        for (int i=0; i<num_list.length; i++) {
            int tmp = 0;
            for (int j=i+1; j<num_list.length; j++) {
                if (num_list[i] > num_list[j]) {
                    tmp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = tmp;
                }
            }
        }
        for (int i : num_list) {
            System.out.println(i);
        }
        for (int i=0; i<answer.length; i++) {
            answer[i] = num_list[i + 5];
        }
        System.out.println("==정답==");
        for (int a : answer) {
            System.out.print(a + " ");
        }

    }

}
