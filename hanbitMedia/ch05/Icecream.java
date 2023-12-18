package hanbitMedia.ch05;

import java.util.Scanner;

public class Icecream {
    private static int n, m;
    private static int[][] graph = new int[1000][1000]; //graph를 적당히 큰 크기로 설정
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 아래부터 문자열로 받을 것이기 때문에 버퍼 지우기

        // 2차원 배열의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                //한 줄에 받은 문자열(String) -> char(한 글자씩) -> int 변환
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // 모든 노드에 대하여 음료수 채우기
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 현재 위치에서 DFS 수행
                if (dfs(i, j)) {
                    result++;
                }
            }
        }
        System.out.printf("아이스크림이 %d개 생성 됩니다.", result);
    }

    private static boolean dfs(int x, int y) {
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }
        // 현재 노드를 아직 방문하지 않았다면
        if (graph[x][y] == 0) {
            // 해당 노드 방문 처리
            graph[x][y] = 1;
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfs(x + 1, y); // 상
            dfs(x - 1, y); // 하
            dfs(x, y - 1); // 좌
            dfs(x, y + 1); // 우
            return true;
        }
        return false;
    }

}
