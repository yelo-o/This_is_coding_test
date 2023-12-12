package etc.November.november02;

public class Sol2 {
    public static void main(String[] args) {
        // 명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
        // 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다.
        // 이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int preMax = 0;
        int preMin = 0;
        for (int[] size : sizes) {
            int curMax = Math.max(size[0], size[1]);
            int curMin = Math.min(size[0], size[1]);
            System.out.println("최대 : " + curMax + ", 최소 :" + curMin);

            preMax = Math.max(curMax, preMax); //큰 것들 중에 제일 큰거
            preMin = Math.max(curMin, preMin); //작은 것들 중에 그나마 큰거
            System.out.println("찐 최대 : " + preMax + ", 찐 최소 :" + preMin);
            System.out.println();

        }
        int answer = preMax * preMin;
        System.out.println(answer);

    }
}
