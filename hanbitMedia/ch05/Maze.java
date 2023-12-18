package hanbitMedia.ch05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MazeNode {
    private int x;
    private int y;

    public MazeNode(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

}
public class Maze {
    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        // 2차원 배열의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // BFS 수행 결과 출력
        System.out.printf("탈출하기 위해 움직여야 하는 최소 이동 칸 : %d ", bfs(0, 0));
    }

    private static int bfs(int x, int y) {
        // 큐(Queue) 구현을 위해 queue 라이브러리 사용
        Queue<MazeNode> que = new LinkedList<>();
        que.offer(new MazeNode(x, y));

        //큐가 빌 때까지 반복하기
        while (!que.isEmpty()) {
            MazeNode node = que.poll();
            x = node.getX();
            y = node.getY();
            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                // 미로 찾기 공간을 벗어난 경우 무시
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                // 벽인 경우 무시
                if (graph[nx][ny] == 0) {
                    continue;
                }
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    que.offer(new MazeNode(nx, ny));
                }
            }
        }
        // 가장 오른쪽 아래까지의 최단 거리 반환
        return graph[n - 1][m - 1];
    }

}
